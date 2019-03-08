public class MusicNote
{
    private String letterNote;
    private boolean sharp;
    private boolean flat;
    private int octave;
    private int duration;

    public MusicNote(String letterNote, boolean sharp, boolean flat, int octave, int duration)
    {
        this.letterNote = letterNote;
        this.sharp = sharp;
        this.flat = flat;
        this.octave = octave;
        this.duration = duration;
    }

    public MusicNote(String noteString)
    {
        if(noteString.length() < 5 )
        {
            System.out.println("error!! the input size must be 5");
            return;
        }
        String letterNote = noteString.charAt(0)+"";
        boolean sharp = (noteString.charAt(1)+"").equals("#")? true : false;
        boolean flat = (noteString.charAt(2)+"").equals("#") ? true : false;
        int octave = Integer.parseInt(noteString.charAt(3)+"");
        int duration = Integer.parseInt(noteString.charAt(4)+"");


    }

	public MusicNote clone()
	{
		return new MusicNote(this.letterNote, this.sharp, this.flat, this.octave, this.duration);
	}

    public String getLetterNote()
    {
        return letterNote;
    }

    public boolean getSharp()
    {
        return sharp;
    }

    public boolean getFlat()
    {
        return flat;
    }

    public int getOctave()
    {
        return octave;
    }

    public int getDuration()
    {
        return duration;
    }

    public double getNoteFrequency(double tunedFrequency)
    {
        if(letterNote.equals("&"))
        {
            return 0;
        }

        int semitone = 0;
        // set semitone based on sharp and flat
        if (sharp && flat)
        {
            semitone = 0;
        }
        else if (sharp)
        {
            semitone = 1;
        }
        else if (flat)
        {
            semitone = -1;
        }
        // set semitone based on octave
        if(octave > 4)
        {
            semitone = semitone - 12 * ( 4 - octave);
        }
        else if(octave < 4)
        {
            semitone = semitone + 12 * ( 4 - octave);
        }
        switch(letterNote)
        {
            case "B":
                semitone += 2;
                break;
            case "C":
                semitone -= 9 ;
                break;
            case "D":
                semitone -= 7;
                break;
            case "E":
                semitone  -= 5;
                break;
            case "F":
                semitone -= 4;
                break;
            case "G":
                semitone -=2;
                break;
        }

        double tF =  tunedFrequency * Math.pow(Math.pow(2,(1.0/12.0)),semitone);
        //System.out.println(""+tunedFrequency+" "+tF+" ");
        return tF;
    }

    public String toString()
    {
        return "MusicNote[ letterNote"+letterNote+sharp+flat+octave+duration;
    }

}
