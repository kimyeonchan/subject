package videoplayer;

public class StartState implements State{
	VideoPlayer vp;
	
	public StartState(VideoPlayer vp){
		this.vp = vp;
	}
	public void insertvideo(){
		System.out.println("You can't insert another Video");
	}
	public void startvideo(){
		System.out.println("already Start..");
	}
	public void ejectvideo(){
		System.out.println("eject video ..");
		vp.setState(vp.getNoVideoState());
	}
	public void stopvideo(){
		System.out.println("The Player Stop..");
		vp.setState(vp.getStopState());
	}
	public void breakdownvideo(){
		System.out.println("The Player is malfunctioning. Please use later.");
	}
}
