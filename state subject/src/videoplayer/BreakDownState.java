package videoplayer;

public class BreakDownState implements State{
	VideoPlayer vp;
	
	public BreakDownState(VideoPlayer vp){
		this.vp = vp;
	}
	public void insertvideo(){
		System.out.println("The Player is malfunctioning. Please use later.");
	}
	public void startvideo(){
		System.out.println("The Player is malfunctioning. Please use later.");
	}
	public void ejectvideo(){
		System.out.println("The Player is malfunctioning. Please use later.");
	}
	public void stopvideo(){
		System.out.println("The Player is malfunctioning. Please use later.");
	}
	public void breakdownvideo(){
		System.out.println("The Player is malfunctioning. Please use later.");
	}
}
