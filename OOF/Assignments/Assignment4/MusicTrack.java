import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MusicTrack
{
    private final static int SAMPLE_RATE = 8000;
    private final static int MID_RANGE = 127;
    private double tunedFrequency;
    private int numberOfNotes;
    private MusicNote[] musicNotes;
    private String songName;
    private String artist;
    private String genre;
    private int year;

    public MusicTrack(String songName, String artist, String genre, int year)
    {
        this.songName = songName;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        readMusicFile(songName);
    }
    /**
     * sets genre to default "UNKNOWN" and year to -1.
     */
    public MusicTrack(String songName,String artist)
    {
        this.songName = songName;
        this.artist = artist;
        this.genre = "UNKNOWN";
        this.year = -1;
        readMusicFile(songName);
    }

    private void readMusicFile(String songName)
    {
		    //System.out.println("reading file for "+ songName);
        String fileName = songName+".txt";
        try
        {
            Scanner fileInput = new Scanner(new FileInputStream(fileName));
			      //System.out.println("reading file for "+ songName);
            if(!fileInput.hasNext())
            {
                System.out.println("The file is input");
                return;
            }

            int tunedFrequency = Integer.parseInt(fileInput.nextLine());
            this.tunedFrequency = tunedFrequency;
            int notesCount = Integer.parseInt(fileInput.nextLine());
			      //System.out.println(notesCount);
            this.musicNotes = new MusicNote[notesCount];
            for ( int i = 0 ; i < notesCount ; i++)
            {
                String line = fileInput.nextLine();
                musicNotes[i] = parseStringToNote(line);
            }
        }
        catch(FileNotFoundException e)
        {
            //System.out.println("The file for the song does not exists.");
			       this.numberOfNotes = 0;


        }


    }



    private MusicNote parseStringToNote(String noteString)
    {
        String letterNote = noteString.charAt(0)+"";
        boolean sharp = (noteString.charAt(1)+"").equals("#")? true : false;
        boolean flat = (noteString.charAt(2)+"").equals("#") ? true : false;
        int octave = Integer.parseInt(noteString.charAt(3)+"");
        int duration = Integer.parseInt(noteString.charAt(4)+"");
        MusicNote note = new MusicNote(letterNote, sharp, flat, octave, duration);

        //System.out.println(note);
        return note;

    }

    public boolean equals(MusicTrack otherMusic)
    {
        return this.songName.equalsIgnoreCase(otherMusic.getSongName()) && this.artist.equalsIgnoreCase(otherMusic.getArtistName()) ? true : false ;
    }
    /**
     * @param songName name of the song
     * @param artist namef of the artist
     * @return true if such song exists else false
     */
    public boolean equals(String songName, String artist)
    {
        MusicTrack newMusic = new MusicTrack(songName, artist);
        return this.equals(newMusic);
    }

    public MusicNote[] getMusicNotes()
    {
        MusicNote[] newNotes = new MusicNote[musicNotes.length];

        for(int i = 0; i < musicNotes.length ; i++)
        {
            newNotes[i] = musicNotes[i].clone();
        }
        return newNotes;
    }

    public String toString()
    {
        return "MusicTrack[ songName: "+this.songName+" artist: "+this.artist+" genre: "+this.genre+" year: "+this.year+" ]";
    }

    public String getSongName()
    {
        return this.songName;
    }

    public String getArtistName()
    {
        return this.artist;
    }

    public String getGenre()
    {
        return this.genre;
    }

    public int getYear()
    {
        return this.year;
    }
	  public int getNumberOfNotes()
	  {
		    return musicNotes == null ? 0 : this.musicNotes.length;
	  }

    public void setSongName(String songName)
    {
        this.songName = songName;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    private int CalculateTrackLength(int tempo)
    {
        int tracklength=0;
        for(MusicNote music: this.musicNotes)
        {
            tracklength+=(SAMPLE_RATE/music.getDuration())*(60.0/tempo);
        }
        return(tracklength);
    }

    public byte[] BuildHeader(int tempo)
    {
        int tracklength = CalculateTrackLength(tempo);
        int tracklengthtotal = tracklength+36;
        //little endian 4(4),16(4),20(2),22(2),24(4),28(4),32(2),34(2),40(4)
        //big endian 0(4),8(4),12(4),36(4)
        byte[] header = {
                //RIFF Header
                0x52,0x49,0x46,0x46,
                (byte)(tracklengthtotal),  (byte)(tracklengthtotal>>8), (byte)(tracklengthtotal>>16),(byte)(tracklengthtotal>>24),
                0x57,0x41,0x56,0x45,
                //WAVE - format
                //Pulse Code Modulation - Linear Quantization - Mono - SR = 8000Hz - BitsPerSample = 8
                0x66,0x6D,0x74,0x20,0x10, 0x00,0x00,0x00, 0x01, 0x00, 0x01, 0x00, 0x40, 0x1F, 0x00, 0x00, 0x40, 0x1F, 0x00, 0x00, 0x01, 0x00, 0x08, 0x00,
                //WAVE - data
                0x64, 0x61, 0x74, 0x61,   (byte)(tracklength),  (byte)(tracklength>>8), (byte)(tracklength>>16),(byte)(tracklength>>24)};
        return(header);
    }

    public double getTunedFrequency()
    {

        return tunedFrequency;
    }

    public static int getSampleRate()
    {
        return SAMPLE_RATE;
    }

    public static int getMidRange()
    {
        return MID_RANGE;
    }
}
