public class PizzaTest{
  public static void main(String[] args){
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    Pizza pizza1 = store.orderPizza("cheese");
    System.out.println("We ordered a " + pizza1.getName()+"\n");
    
    Pizza pizza2 = store.orderPizza("Veggi");
    System.out.println("We ordered a " + pizza2.getName()+"\n");
    
    Pizza pizza3 = store.orderPizza("Clam");
    System.out.println("We ordered a " + pizza3.getName()+"\n");
    
    Pizza pizza4 = store.orderPizza("Pepperoni");
    System.out.println("We ordered a " + pizza4.getName()+"\n");
    
    Pizza pizza5 = store.orderPizza("Potato");
    System.out.println("We ordered a " + pizza5.getName()+"\n");
  }
}
