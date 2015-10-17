public class PizzaTest{
  public static void main(String[] args){
    PizzaStore nystore = new NYPizzaStore();
    Pizza nypizza1 = nystore.orderPizza("cheese");
    System.out.println("We ordered a " + nypizza1+"\n");
    Pizza nypizza2 = nystore.orderPizza("Clam");
    System.out.println("We ordered a " + nypizza2+"\n");
    
    PizzaStore chicagostore = new ChicagoPizzaStore();
    Pizza chicagopizza1 = chicagostore.orderPizza("Cheese");
    System.out.println("We ordered a " + chicagopizza1+"\n");
    Pizza chicagopizza2 = chicagostore.orderPizza("Pepperoni");
    System.out.println("We ordered a " + chicagopizza2+"\n");
    Pizza chicagopizza3 = chicagostore.orderPizza("Clam");
    System.out.println("We ordered a " + chicagopizza3+"\n");
    Pizza chicagopizza4 = chicagostore.orderPizza("Veggie");
    System.out.println("We ordered a " + chicagopizza4+"\n");
    
    PizzaStore smstore = new SMPizzaStore();
    Pizza smpizza1 = smstore.orderPizza("Potato");
    System.out.println("We ordered a " + smpizza1+"\n");
  }
}