public class CheesePizza extends Pizza{
	public CheesePizza() {
		name = "Cheese Pizza"; 
		}
	public void prepare(){
		System.out.println(name+" preparing ...");
		}
	public void bake(){
		System.out.println(name+" Baking ...");
		}  
	public void cut(){    
		System.out.println(name+" cutting ..."); 
		}
	public void box(){
		System.out.println(name+" boxing...");
		}
	public String getName(){
		return name;
		}
	public String toString(){
		System.out.println("---"+name+"---");
		return name;
		}
}
