
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;
  
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }
    
    public synchronized void createChocolate(){
    	fill();
    	boil();
    	drain();
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
        System.out.println("filling");
    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
        System.out.println("draining");
    }
 
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
        System.out.println("boiling");
    }
  
    public boolean isEmpty() {
        return empty;
    }
 
    public boolean isBoiled() {
        return boiled;
    }
}
