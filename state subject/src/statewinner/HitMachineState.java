package statewinner;

public class HitMachineState implements State{
    GumballMachine gumballMachine;
    
    public HitMachineState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertQuarter() {
    	System.out.println("The machine is malfunctioning. Please use later.");
    }
 
    public void ejectQuarter() {
    	System.out.println("The machine is malfunctioning. Please use later.");
    }
 
    public void turnCrank() {
    	System.out.println("The machine is malfunctioning. Please use later.");
    }
 
    public void dispense() {
    	System.out.println("The machine is malfunctioning. Please use later.");
    }
 
    public void hitmachine() {
    	System.out.println("The machine is malfunctioning. Please use later.");
    }
    
    public String toString() {
        return "The machine is malfunctioning. Please use later.";
    }
}
