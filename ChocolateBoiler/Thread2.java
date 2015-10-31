
public class Thread2 extends Thread{
	public void run(){
	    ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
	    try{
	    	Thread.sleep(1000);
	    }
	    catch(InterruptedException e){
	    	System.out.println(e.getMessage());
	    }
        boiler2.createChocolate();
	    
	}
}

