
public class Thread4 extends Thread{
	public void run(){
	    ChocolateBoiler boiler4 = ChocolateBoiler.getInstance();
	    try{
	    	Thread.sleep(100000);
	    }
	    catch(InterruptedException e){
	    	System.out.println(e.getMessage());
	    }
	}
}

