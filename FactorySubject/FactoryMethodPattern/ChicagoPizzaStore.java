
public class ChicagoPizzaStore extends PizzaStore{
  Pizza createPizza(String name){
    ChicagoStylePizza pizza = null;
    if(name.equals("Cheese")){
      pizza = new ChicagoStyleCheesePizza();
    }
    else if(name.equals("Pepperoni")){
    	pizza = new ChicagoStylePepperoniPizza();
    }
    else if(name.equals("Clam")){
    	pizza = new ChicagoStyleClamPizza();
    }
    else if(name.equals("Veggie")){
    	pizza = new ChicagoStyleVeggiePizza();
    }
    return pizza;
  }
}