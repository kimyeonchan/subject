
public class Thread3 extends Thread{
	public void run(){
	    PrintSpooler boiler3 = PrintSpooler.getInstance();
        try{
        	Thread.sleep(1000);
        }
        catch(InterruptedException e){
        	System.out.println(e.getMessage());
        }
        boiler3.Printuse();
    }
}
