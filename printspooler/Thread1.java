
public class Thread1 extends Thread{
	public void run(){
	    PrintSpooler boiler1 = PrintSpooler.getInstance();
        try{
        	Thread.sleep(1000);
        }
        catch(InterruptedException e){
        	System.out.println(e.getMessage());
        }
        boiler1.Printuse();
    }
}
