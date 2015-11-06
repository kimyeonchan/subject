
public class SMPizzaIngredientFactory implements PizzaIngredientFactory{
	public Dough createDough(){
		Dough dough = new ThinCrustDough();
		return dough;
	}
	public Cheese createCheese(){
		Cheese cheese = new MozzarellaCheese();
		return cheese;
	}

}
