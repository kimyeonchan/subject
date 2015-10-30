
public class Thread1 extends Thread{
	public void run(){
	    ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
        try{
        	Thread.sleep(100000);
        }
        catch(InterruptedException e){
        	System.out.println(e.getMessage());
        }
    }
}
