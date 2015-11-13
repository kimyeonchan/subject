package home;

public class StandLight {
    String description;
    int intensity;
    
    public StandLight(String description) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + " on");
    }
 
    public void off() {
        System.out.println(description + " off");
    }
 
    public void setintensity(int intensity) {
        System.out.println(description + " setting intensity to " + intensity);
        this.intensity = intensity;
    }
    public String toString() {
    	return description;
    }
}
