/**
 * MusicTrack class is general implementation of a common music file.
 * It has Song name, artist name, genre and year of release.
 * @author 19539061
 * @version 1.0
 * @since 10-01-2018
 */
public class MusicTrack
{
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
}