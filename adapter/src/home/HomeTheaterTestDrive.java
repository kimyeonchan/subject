package home;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");
        Computer computer = new Computer("Computer");
        Musicplayer musicPlayer = new Musicplayer("Music Player");
        StandLight standLight = new StandLight("Stand table Light");
        HomeTheaterFacade homeTheater = 
                new HomeTheaterFacade(amp, tuner, dvd, cd, 
                        projector, screen, lights, popper,computer,standLight,musicPlayer);
 
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
        homeTheater.beginStudy();
        homeTheater.endStudy();
    }
}
