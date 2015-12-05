package videoplayer;

public class VideoPlayer {
	State breakDownState;
	State hasVideoState;
	State noVideoState;
	State StartState;
	State StopState;
	State state;
	
	public VideoPlayer(){
		breakDownState = new BreakDownState(this);
		hasVideoState = new HasVideoState(this);
		noVideoState = new NoVideoState(this);
		StartState = new StartState(this);
		StopState = new StopState(this);
		state = noVideoState;
	}
	
	public void insertVideo(){
		state.insertvideo();
	}
	
	public void ejectVideo(){
		state.ejectvideo();
	}
	
	public void startVideo(){
		state.startvideo();
	}
	
	public void stopVideo(){
		state.stopvideo();
	}
	
	public void hitVideo(){
		state.breakdownvideo();
	}
	
	public void setState(State state){
		this.state= state;
	}
	public State getHasVideoState(){
		return hasVideoState;
	}
	public State getBreakDwonState(){
		return breakDownState;
	}
	public State getNoVideoState(){
		return noVideoState;
	}
	public State getStartState(){
		return StartState;
	}
	public State getStopState(){
		return StopState;
	}
	
	
}
