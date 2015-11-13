package home;

public class Musicplayer {
    String description;
    Amplifier Amp;
    String music;
    
    public Musicplayer(String description) {
        this.description = description;
    }
    
    public void on() {
        System.out.println(description + " on");
    }
 
    public void off() {
        System.out.println(description + " off");
    }
 
    public void setmusic(String music) {
        System.out.println(description + " setting music to " + music);
        this.music = music;
    }
    public String toString() {
    	return description;
    }
}
