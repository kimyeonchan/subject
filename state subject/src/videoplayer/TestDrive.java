package videoplayer;

public class TestDrive {
	public static void main(String[] args) {
		VideoPlayer vp = new VideoPlayer();
		
		vp.insertVideo();
		vp.startVideo();
		vp.insertVideo();
		vp.startVideo();
		vp.ejectVideo();
		vp.stopVideo();
		vp.insertVideo();
		vp.stopVideo();
		vp.startVideo();
		vp.stopVideo();
		
	}
}
