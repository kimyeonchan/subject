package home;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights theaterlights;
    Screen screen;
    PopcornPopper popper;
    Computer computer;
    StandLight standLight;
    Musicplayer musicplayer;
 
    public HomeTheaterFacade(Amplifier amp,Tuner tuner,DvdPlayer dvd,CdPlayer cd,Projector projector,
    		Screen screen,TheaterLights theaterlights,PopcornPopper popper,Computer computer ,StandLight standLight
    		,Musicplayer musicplayer){
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.theaterlights = theaterlights;
        this.popper = popper;
        this.computer = computer;
        this.standLight = standLight;
        this.musicplayer = musicplayer;
    }
 
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        theaterlights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }
 
 
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        theaterlights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public void listenToCd(String cdTitle) {
        System.out.println("Get ready for an audiopile experence...");
        theaterlights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cd);
        amp.setStereoSound();
        cd.on();
        cd.play(cdTitle);
    }

    public void endCd() {
        System.out.println("Shutting down CD...");
        amp.off();
        amp.setCd(cd);
        cd.eject();
        cd.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
    
    public void beginStudy(){
        System.out.println("Get ready to study...");
        tuner.off();
        theaterlights.off();
        screen.up();
        projector.off();
        popper.off();
        dvd.off();
        cd.off();
        computer.on();
        standLight.on();
        standLight.setintensity(3);
        musicplayer.on();
        musicplayer.setmusic("Classic");
        amp.on();
        amp.setVolume(2);
        amp.setMusic(musicplayer);
    }
    
    public void endStudy(){
    	System.out.println("end study ...");
    	computer.off();
    	standLight.off();
    	musicplayer.off();
    	amp.off();
    }
}
