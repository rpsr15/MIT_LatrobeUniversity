import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;

public class MusicDriver {
    private MusicTrack[] tracks;
    private Scanner input;
    private int currentTrack = 0;
    private final int MAX_TRACKS = 3;

    public MusicDriver() {
        input = new Scanner(System.in);
        tracks = new MusicTrack[MAX_TRACKS];
        for(MusicTrack track : tracks)
        {
            track = null;
        }
    }

    public static void main(String[] args) {
        MusicDriver music = new MusicDriver();
        music.run();
    }
    private void writeMusicFileSine(int trackIndex, String filename, byte volume, int tempo) throws IOException
    {
        FileOutputStream outputStream = new FileOutputStream(new File(filename + ".wav"));
        byte[] header = tracks[trackIndex].BuildHeader(tempo);

        outputStream.write(header,0, header.length);

        for(MusicNote musicNote : tracks[trackIndex].getMusicNotes())
        {
            double frequency = musicNote.getNoteFrequency(tracks[trackIndex].getTunedFrequency());
            for (int data = 0; data < (MusicTrack.getSampleRate()/musicNote.getDuration())*(60.0/tempo); data++)
            {
                outputStream.write(MusicTrack.getMidRange()+((byte)(volume*Math.sin(data*(1.0/MusicTrack.getSampleRate())*2*Math.PI*frequency))));
            }
        }
        outputStream.close();
    }

    private void writeMusicFileSquare(int trackIndex, String filename, byte volume, int tempo) throws IOException
    {
        FileOutputStream outputStream = new FileOutputStream(new File(filename + ".wav"));

        byte[] header = tracks[trackIndex].BuildHeader( tempo);

        outputStream.write(header,0, header.length);
        for(MusicNote musicNote : tracks[trackIndex].getMusicNotes())
        {
            double frequency = musicNote.getNoteFrequency(tracks[trackIndex].getTunedFrequency());

            int counter=0;
            int offsetDirection = 1;
            for (int i=0; i < (MusicTrack.getSampleRate()/musicNote.getDuration())*(60.0/tempo); i++)
            {
                counter++;
                outputStream.write(MusicTrack.getMidRange()+(volume*offsetDirection));
                if((counter>=((MusicTrack.getSampleRate()/frequency)/2)) && (frequency!=0))
                {
                    counter = 0;
                    offsetDirection =	offsetDirection==1?-1:1;
                }
            }
        }
        outputStream.close();
    }

    public void run() {
        int userChoice = 0;
        System.out.println("***Ravi Rathore 19539061***\nAudio Generator Part A\n");
        while (userChoice != 8) {
            this.displayMenu();

            System.out.print("Enter choice >> ");
            userChoice = input.nextInt();
            input.nextLine();
            System.out.println();
            this.process(userChoice);
        }

    }

    private void process(int choice) {
        switch (choice) {
            case 1:
                this.loadTrack();
                break;
            case 2:
                this.loadTrackFromFile();
                break;
            case 3:
                this.removeTrack();
                break;
            case 4:
                this.printTrack();
                break;
            case 5:
                this.printTrackList();
                break;
            case 6:
                editTrack();
                break;
            case 7:
                exportAudio();
                break;
            case 8:
                break;
            default:
                System.out.println("This is not a valid choice.\n");
                break;
        }
    }

    private void displayMenu() {
        System.out.println(
                "AUDIO GENERATOR MENU\n\t1. Load new track\n\t2. Load new track from file\n\t3. Remove last track\n\t"
                        + "4. Print track information\n\t5. Print track list\n\t6. Edit track information\n\t7. Export music to wav file\n\t8. Exit");
    }

    private int searchMusicTrack(String songName, String artist) {


        for(int i = 0; i < currentTrack ; i++)
        {
            if(tracks[i].equals(songName,artist))
            {
                return i;
            }
        }
        return -1;
    }



    private void printTrack() {
        System.out.print("Enter Song Name: ");
        String songName = input.nextLine();

        System.out.print("Enter Artist Name: ");
        String artistName = input.nextLine();
        System.out.println();
        int resultTrack = searchMusicTrack(songName, artistName);
        if (resultTrack == -1) {
            System.out.println("Track does not exist\n");
        } else {
            System.out.println(tracks[resultTrack]);
        }
        System.out.println();
        return;

    }

    private void removeTrack() {
        if(!isEmpty())
        {
            tracks[currentTrack - 1] = null;
            currentTrack--;
        }
        else
        {
            System.out.println("No track to remove\n");
        }
    }

    private void printTrackList() {

        if(isEmpty())
        {
            System.out.println("The track list empty.");
			System.out.println();
            return;
        }
        for(int i = 0 ; i < currentTrack; i++)
        {
            System.out.println(tracks[i]);
        }
    }

    private void loadTrack() {
        if (isFull()) {
            System.out.println("Maximum tracks reached.");
	    System.out.println();
            return;
        }

        System.out.print("Enter song name: ");
        String newSongName = this.input.nextLine();
        System.out.print("Enter artist name: ");
        String newArtist = this.input.nextLine();
        System.out.print("Enter genre: ");
        String newGenre = this.input.nextLine();
        System.out.print("Enter year: ");
        int newYear = -1;
        try {
            newYear = this.input.nextInt();
            input.nextLine();

        } catch (InputMismatchException e) {

            System.out.println(e);
            // // take care of input here if int not added by user
        }
        System.out.println();
        MusicTrack newTrack = new MusicTrack(newSongName, newArtist, newGenre, newYear);
		addTrack(newTrack);



    }

    private void addTrack(MusicTrack newTrack)
    {
        if(searchMusicTrack(newTrack.getSongName(),newTrack.getArtistName()) != -1)
		{
			System.out.println("Track already exits!");

		}
		else if(!isFull())
        {
            tracks[currentTrack++] = newTrack;
        }
		return;
    }

    private boolean isFull()
    {
        return currentTrack == MAX_TRACKS ? true : false;
    }
    private boolean isEmpty()
    {
        return currentTrack == 0 ? true : false;
    }

    private void editTrack()
    {
        if(isEmpty())
        {
            System.out.println("Track list is empty.");
			System.out.println();
            return;
        }
        System.out.print("Enter song name: ");
        String songName = input.nextLine();
        System.out.print("Enter artist name: ");
        String artistName = input.nextLine();
        System.out.println();
        int music = searchMusicTrack(songName, artistName);
        if(music == -1)
        {
            System.out.println("Track does not exist.");
            return;
        }
        else {
            System.out.println(tracks[music]);
            System.out.println();
            System.out.print("\t\t1. Edit Song Name\n\t\t2. Edit artist\n\t\t3. Edit genre\n\t\t4. Edit year\n");
            System.out.print("Enter choice >> ");
            int response = input.nextInt();
            input.nextLine();
            System.out.println();
            int newMusic ;
            switch(response)
            {
                case 1:
                    System.out.print("Enter new song name: ");
                    String newSongName = input.nextLine();
                    System.out.println();
                    newMusic = searchMusicTrack(newSongName, artistName);
                    if(newMusic != -1)
                    {
                        System.out.println("Track already exists!!");
                    }
                    else
                    {
                        tracks[music].setSongName(newSongName);

                    }


                    return;
                case 2:
                    System.out.print("Enter new artistName: ");
                    String newArtist = input.nextLine();
                    System.out.println();
                    newMusic = searchMusicTrack(songName, newArtist);
                    if(newMusic != -1)
                    {
                        System.out.println("Track exists!!");
                    }
                    else
                    {
                        tracks[music].setArtist(newArtist);
                    }
                    return;
                case 3:
                    System.out.print("Enter new genre: ");
                    String genre = input.nextLine();
                    System.out.println();
                    tracks[music].setGenre(genre);
                    return;

                case 4:
                    System.out.print("Enter new year: ");
                    int year = input.nextInt();
                    input.nextLine();
                    System.out.println();
                    tracks[music].setYear(year);
                    return;

            }

        }
    }
    /**
     * loads MusicTrack from file name entered.
     */
    private void loadTrackFromFile() {

        if (isFull()) {
            System.out.println("Maximum tracks reached.");
			System.out.println();
            return;
        }
        System.out.print("Enter input file name >> ");
        String fileName = this.input.nextLine();
        System.out.println();
        if (fileName.isEmpty()) {
            System.out.println("Please enter a valid file name");
            System.out.println();
            return;
        }
        try {
            Scanner inputStream = new Scanner(new FileInputStream(fileName));
            //System.out.println("here");
            int lineCount = 0;
            String songName = "", artistName = "", genre = "";
            int year = -1;
            while (inputStream.hasNext()) {
                lineCount++;
                String line = inputStream.nextLine();
                //System.out.println(lineCount+line);
                switch (lineCount) {

                    case 1:
                        songName = line;
                        break;
                    case 2:
                        artistName = line;
                        break;
                    case 3:
                        genre = line;
                        break;
                    case 4:
                        year = Integer.parseInt(line);
                        //input.nextLine();
                        break;
                    default:
                        System.out.println("jere");
                        break;
                }

            }
            //	System.out.println(lineCount);
            MusicTrack music;
            //ToDo check for track already exists
            if (lineCount == 2) {
                music = new MusicTrack(songName, artistName);
				addTrack(music);
            } else if (lineCount == 4) {
                music = new MusicTrack(songName, artistName, genre, year);
                addTrack(music);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Can not open file or file does not exit.");
            System.out.println();
            return;
        }
        return;

    }

    public void exportAudio()
    {
        System.out.print("Enter song name: ");
        String songName = input.nextLine();
        System.out.print("Enter artist name: ");
        String artistName = input.nextLine();

		  int index = searchMusicTrack(songName, artistName);
        if(index == -1 )
        {
            System.out.println("Track does not exist");
            return;
        }
		if(tracks[index].getNumberOfNotes() == 0)
		{
			System.out.println("The music track does not have notes stored and hence cannot be exported to audio.");
			return;
		}
        System.out.print("Enter wave type 1. Sine or 2. Square: ");
        int waveType = input.nextInt();
        input.nextLine();
        System.out.print("Enter volume (0 - 127): ");
        byte volume = input.nextByte();
        System.out.print("Enter tempo (0 - 180): ");
         int tempo = input.nextInt();
        input.nextLine();
        System.out.print("Enter audio output name: ");
        String outputName = input.nextLine();

        if( waveType == 1)
        {
            try {
                writeMusicFileSine(index, outputName, volume, tempo);
            }
            catch (IOException e )
            {
                System.out.println("io exception");
            }
        }
        else
        {
            try {
                writeMusicFileSquare(index, outputName, volume, tempo);
            }
            catch (IOException e )
            {
                System.out.println("io exception");
            }

        }
    }
}
