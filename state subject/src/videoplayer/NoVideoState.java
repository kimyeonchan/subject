package videoplayer;

public class NoVideoState implements State{
	VideoPlayer vp;
	
	public NoVideoState(VideoPlayer vp){
		this.vp = vp;
	}
	public void insertvideo(){
		System.out.println("insert Video ..");
		vp.setState(vp.getHasVideoState());
	}
	public void startvideo(){
		System.out.println("You can't insert Video");
	}
	public void ejectvideo(){
		System.out.println("You can't insert Video");
	}
	public void stopvideo(){
		System.out.println("You can't insert Video");
	}
	public void breakdownvideo(){
		System.out.println("The Player is malfunctioning. Please use later.");
	}
}
