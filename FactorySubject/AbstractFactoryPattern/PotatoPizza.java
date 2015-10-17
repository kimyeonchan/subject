
public class PotatoPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	Dough dough;
	Cheese cheese;
	public PotatoPizza(PizzaIngredientFactory pizzaIngredientFactory){
		name = "PotatoPizza";
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
