public class SimplePizzaFactory{
  public Pizza createPizza(String type){
    Pizza pizza = null;
    if(type.equals("cheese")){
      pizza = new CheesePizza();
    }
    else if(type.equals("Veggi")){
      pizza = new VeggiePizza();
    }
    else if(type.equals("Clam")){
    	pizza = new ClamPizza();
    }
    else if(type.equals("Pepperoni")){
    	pizza = new PepperoniPizza();
    }
    else if(type.equals("Potato")){
    	pizza = new PotatoPizza();
    }
    return pizza;
  }
}
