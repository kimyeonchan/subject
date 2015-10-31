
public class Thread5 extends Thread{
	public void run(){
	    PrintSpooler boiler5 = PrintSpooler.getInstance();
        try{
        	Thread.sleep(1000);
        }
        catch(InterruptedException e){
        	System.out.println(e.getMessage());
        }
        boiler5.Printuse();
    }
}
