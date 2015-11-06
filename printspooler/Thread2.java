
public class Thread2 extends Thread{
	public void run(){
	    PrintSpooler boiler2 = PrintSpooler.getInstance();
        try{
        	Thread.sleep(1000);
        }
        catch(InterruptedException e){
        	System.out.println(e.getMessage());
        }
        boiler2.Printuse();
        if(boiler2.getuse()){
            boiler2.resetprint();
        }
   }
}
