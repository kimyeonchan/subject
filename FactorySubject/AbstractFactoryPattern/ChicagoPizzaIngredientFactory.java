
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
	public Dough createDough(){
		Dough dough = new ThinCrustDough();
		return dough;
	}
	public Cheese createCheese(){
		Cheese cheese = new ReggianoCheese();
		return cheese;
	}

}
