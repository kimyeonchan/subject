
public class NYPizzaStore extends PizzaStore{
	public NYPizzaStore(){
		ingredientFactory = new NYPizzaIngredientFactory();
	}
	public Pizza createPizza(String type){
		Pizza pizza =null;
		if(type.equals("Cheese")){
			pizza = new CheesePizza(ingredientFactory);
		}
		else if(type.equals("Clam")){
			pizza = new ClamPizza(ingredientFactory);
		}
		else if(type.equals("Pepperoni")){
			pizza = new PepperoniPizza(ingredientFactory);
		}
		else if(type.equals("Veggie")){
			pizza = new VeggiePizza(ingredientFactory);
		}
		else if(type.equals("Potato")){
			pizza = new PotatoPizza(ingredientFactory);
		}
		return pizza;
	}
}
