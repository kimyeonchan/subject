
public class Thread5 extends Thread{
	public void run(){
	    ChocolateBoiler boiler5 = ChocolateBoiler.getInstance();
	    try{
	    	Thread.sleep(1000);
	    }
	    catch(InterruptedException e){
	    	System.out.println(e.getMessage());
	    }
        boiler5.createChocolate();
	}
}

