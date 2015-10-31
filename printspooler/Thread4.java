
public class Thread4 extends Thread{
	public void run(){
	    PrintSpooler boiler4 = PrintSpooler.getInstance();
        try{
        	Thread.sleep(1000);
        }
        catch(InterruptedException e){
        	System.out.println(e.getMessage());
        }
        boiler4.Printuse();
    }
}
