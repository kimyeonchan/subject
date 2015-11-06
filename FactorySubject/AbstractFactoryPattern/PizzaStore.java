
public abstract class PizzaStore {
	PizzaIngredientFactory ingredientFactory;
	abstract public Pizza createPizza(String type);
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
