
public class Thread3 extends Thread{
	public void run(){
	    ChocolateBoiler boiler3 = ChocolateBoiler.getInstance();
	    try{
	    	Thread.sleep(100000);
	    }
	    catch(InterruptedException e){
	    	System.out.println(e.getMessage());
	    }
	}
}

