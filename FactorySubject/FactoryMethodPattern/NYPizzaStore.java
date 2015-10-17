public class NYPizzaStore extends PizzaStore{
  Pizza createPizza(String name){
    NYStylePizza pizza = null;
    if(name.equals("cheese")){
      pizza = new NYStyleCheesePizza();
    }
    else if(name.equals("Clam")){
    	pizza = new NYStyleClamPizza();
    }
    return pizza;
  }
}