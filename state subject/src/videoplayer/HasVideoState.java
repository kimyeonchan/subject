package videoplayer;

public class HasVideoState implements State{
	VideoPlayer vp;
	
	public HasVideoState(VideoPlayer vp){
		this.vp = vp;
	}
	public void insertvideo(){
		System.out.println("You can't insert another Video");
	}
	public void startvideo(){
		System.out.println("The Player Start..");
		vp.setState(vp.getStartState());
	}
	public void ejectvideo(){
		System.out.println("eject video ..");
		vp.setState(vp.getNoVideoState());
	}
	public void stopvideo(){
		System.out.println("The player does not start.");
	}
	public void breakdownvideo(){
		System.out.println("The Player is malfunctioning. Please use later.");
	}
}
