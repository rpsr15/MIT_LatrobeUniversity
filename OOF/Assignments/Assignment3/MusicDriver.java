/**
 * MusicDriver to store and manage MusicTracks.
 * @author 19539061
 * @version 1.0
 * @since 10-01-2018
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MusicDriver {
	private MusicTrack musicTrack1, musicTrack2, musicTrack3;
	private Scanner input;
	private int trackCount = 0;

	public MusicDriver() {
		input = new Scanner(System.in);
	}

	public static void main(String[] args) {
		MusicDriver music = new MusicDriver();
		music.run();
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
		case 8:
			System.out.println("exit");
			break;
		default:
			System.out.println("This is not a valid choice.\n");
			break;
		}
	}

	private void displayMenu() {
		System.out.println(
				"AUDIO GENERATOR MENU\n\t1. Load new track\n\t2. Load new track from file\n\t3. Remove last track\n\t"
						+ "4. Print track information\n\t5. Print track list\n\t6. Edit track information\n\t8. Exit");
	}

	private MusicTrack searchMusicTrack(String songName, String artist) {

		if (this.musicTrack1 != null && this.musicTrack1.equals(songName, artist)) {
			return this.musicTrack1;
		}
		if (this.musicTrack2 != null && this.musicTrack2.equals(songName, artist)) {
			return this.musicTrack2;
		}
		if (this.musicTrack3 != null && this.musicTrack3.equals(songName, artist)) {
			return this.musicTrack3;
		}
		return null;
	}

	private void printTrack() {
		System.out.print("Enter Song Name: ");
		String songName = input.nextLine();
		
		System.out.print("Enter Artist Name: ");
		String artistName = input.nextLine();
		System.out.println();
		MusicTrack resultTrack = searchMusicTrack(songName, artistName);
		if (resultTrack == null) {
			System.out.println("Track does not exist\n");
		} else {
			System.out.println(resultTrack);
		}
		System.out.println();
		return;

	}

	private void removeTrack() {
		if (this.musicTrack3 != null) {
			this.musicTrack3 = null;
			return;
		}
		if (this.musicTrack2 != null) {
			this.musicTrack2 = null;
			return;
		}
		if (this.musicTrack1 != null) {
			this.musicTrack1 = null;
			return;
		}
		System.out.println("No track to remove.\n");
		return;
	}

	private void printTrackList() {

		if (this.musicTrack1 != null) {
			System.out.println(this.musicTrack1.toString());
		} else {
			System.out.println("Empty\n");
			return;
		}

		if (this.musicTrack2 != null) {
			System.out.println(this.musicTrack2);
		}
		if (this.musicTrack3 != null) {
			System.out.println(this.musicTrack3.toString());
		}
		
		System.out.println();
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
      String yr = input.nextLine();
      if( yr.isEmpty())
      {
         yr = "-1";
      }
      try
      {
      newYear = Integer.parseInt(yr);
      }
      catch(NumberFormatException e)
      {
         System.out.println("Please enter valid year");
         return;
      }
      if(newGenre.isEmpty())
      {
         newGenre = "UNKNOWN";
      }
      if(newSongName.isEmpty() || newArtist.isEmpty())
      {
         System.out.println("Song Name and Artist name cannot be empty.");
         return;
      }
		System.out.println();
		MusicTrack newTrack = new MusicTrack(newSongName, newArtist, newGenre, newYear);
		
		MusicTrack music = searchMusicTrack(newSongName, newArtist);
		if(music == null)
		{
			addTrack(newTrack);
		}
		else
		{
			System.out.println("Track already exists!!\n");
		}
		

	}
	
	private void addTrack(MusicTrack newTrack)
	{
		if (this.musicTrack1 == null) {
			this.musicTrack1 = newTrack;
			
		} else if (this.musicTrack2 == null) {
			this.musicTrack2 = newTrack;
		} else if (this.musicTrack3 == null) {
			this.musicTrack3 = newTrack;
		}
	}
	
	private boolean isFull()
	{
		if (musicTrack1 != null && musicTrack2 != null && musicTrack3 != null) {
			
			return true;
		}
		return false;
	}
	private boolean isEmpty()
	{
		return this.musicTrack1 == null ? true : false;
	}
	
	private void editTrack()
	{
		if(isEmpty())
		{
			System.out.println("Track list is empty.\n");
			return;
		}
		System.out.print("Enter song name: ");
		String songName = input.nextLine();
      if(songName.isEmpty())
      {
         System.out.println("song name cannot be empty.");
         return;
      }
		System.out.print("Enter artist name: ");
      String artistName = input.nextLine();
      if(artistName.isEmpty())
      {
         System.out.println("Artist name cannot be empty.");
         return;
      }
		System.out.println();
		MusicTrack music = searchMusicTrack(songName, artistName);
		if(music == null)
		{
			System.out.println("Track does not exist.");
			return;
		}
		else {
			System.out.println(music);
			System.out.println();
			System.out.print("\t\t1. Edit Song Name\n\t\t2. Edit artist\n\t\t3. Edit genre\n\t\t4. Edit year\n");
			System.out.print("Enter choice >> ");
			int response = input.nextInt();
			input.nextLine();
			System.out.println();
			MusicTrack newMusic = null;
			switch(response)
			{
			case 1:
				System.out.print("Enter new song name: ");
				String newSongName = input.nextLine();
            if(newSongName.isEmpty())
            {
               System.out.println("Song name cannot be empty");
               return;
            }
				System.out.println();
				newMusic = searchMusicTrack(newSongName, artistName);
				if(newMusic != null)
				{
					System.out.println("Track already exists!!");
				}
				else
				{
					music.setSongName(newSongName);
					
				}
				
				
				return;
			case 2:
				System.out.print("Enter new artistName: ");
				String newArtist = input.nextLine();
				if(newArtist.isEmpty())
            {
               System.out.println("artist name cannot be empty");
               return;
            }
            System.out.println();
				newMusic = searchMusicTrack(songName, newArtist);
				if(newMusic != null)
				{
					System.out.println("Track exists!!");
				}
				else
				{
					music.setArtist(newArtist);
				}
				return;
			case 3:
				System.out.print("Enter new genre: ");
				String genre = input.nextLine();
            if(genre.isEmpty())
            {
               genre = "UNKNOWN";
            }
				System.out.println();
				music.setGenre(genre);
				return;
				
			case 4:
				System.out.print("Enter new year: ");
				int year = input.nextInt();
				input.nextLine();
				System.out.println();
				music.setYear(year);
				return;
			
			}
			
		}
	}
	/**
	 * loads MusicTrack from file name entered.
	 */
	private void loadTrackFromFile() {
		
		if (isFull()) {
			System.out.println("Maximum tracks reached.\n");
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
			MusicTrack music = null;
			if(songName.isEmpty() || artistName.isEmpty())
         {
            System.out.println("Song name or artist name cannot be empty");
            return;
         }
         if(genre.isEmpty())
         {
            genre = "UNKNOWN";
         }
         
			if (lineCount == 2) {
				music = new MusicTrack(songName, artistName);
			} else if (lineCount == 4) {
				music = new MusicTrack(songName, artistName, genre, year);
			}
         
         MusicTrack existingMusic = searchMusicTrack(songName, artistName);

         if(existingMusic == null)
         {
            addTrack(music);
         }
         else 
         {
            System.out.println("Track already exists.");
         }
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Can not open file or file does not exit.");
			System.out.println();
			return;
		}
		return;

	}
}
