
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
	public Dough createDough(){
		Dough dough = new ThickCrustDough();
		return dough;
	}
	public Cheese createCheese(){
		Cheese cheese = new MozzarellaCheese();
		return cheese;
	}
}
