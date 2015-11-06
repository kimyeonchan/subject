
public class ClamPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	Dough dough;
	Cheese cheese;
	public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
		name = "ClamPizza";
		ingredientFactory = pizzaIngredientFactory;
		dough = ingredientFactory.createDough();
		cheese = ingredientFactory.createCheese();
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
		System.out.println("dough :"+dough + ", cheese :"+cheese +"\n---"+ name+"---");
		return name;
		}
}
