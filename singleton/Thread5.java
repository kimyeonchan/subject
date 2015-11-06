
public class Thread5 extends Thread{
	public void run(){
	    ChocolateBoiler boiler5 = ChocolateBoiler.getInstance();
	    try{
	    	Thread.sleep(100000);
	    }
	    catch(InterruptedException e){
	    	System.out.println(e.getMessage());
	    }
	}
}

