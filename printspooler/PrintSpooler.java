
public class PrintSpooler
{
	private static PrintSpooler uniqueInstance;
	private boolean use; 
	private PrintSpooler()
	{
    	use=false;
    }
	public static synchronized PrintSpooler getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating unique instance of PrintSpooler");
			uniqueInstance = new PrintSpooler();
		}
		else
			System.out.println("Returning instance of PrintSpooler");
 		return uniqueInstance;
 	}
	public void Printuse()
	{
		if (use)
			System.out.println("already use");
		else
			use = true;
		}

	public void resetprint()
	{
		use = false; 
		System.out.println("print reset , can use print  ");
	}
	
	public boolean getuse(){
		return use;
	}
}
