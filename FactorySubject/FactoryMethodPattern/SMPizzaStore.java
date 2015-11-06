
public class SMPizzaStore extends PizzaStore{
	
	Pizza createPizza(String name){
		SMStylePizza pizza = null;
		if(name.equals("Potato")){
			pizza = new SMStylePotatoPizza();
		}
		return pizza;
	}

}
