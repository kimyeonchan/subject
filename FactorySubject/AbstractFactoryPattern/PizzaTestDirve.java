
public class PizzaTestDirve {
	public static void main(String[] args) {
		PizzaStore NYStore = new NYPizzaStore();
		PizzaStore ChicagoStore = new ChicagoPizzaStore();
		PizzaStore SMstore = new SMPizzaStore();
		
		Pizza pizza1 =NYStore.createPizza("Cheese");
		System.out.println("We odrered a " + pizza1);
		Pizza pizza2 =NYStore.createPizza("Pepperoni");
		System.out.println("We odrered a " + pizza2);
		Pizza pizza3 =NYStore.createPizza("Clam");
		System.out.println("We odrered a " + pizza3);
		Pizza pizza4 =NYStore.createPizza("Veggie");
		System.out.println("We odrered a " + pizza4);
		Pizza pizza5 = ChicagoStore.createPizza("Cheese");
		System.out.println("We odrered a " + pizza5);
		Pizza pizza6 = ChicagoStore.createPizza("Pepperoni");
		System.out.println("We odrered a " + pizza6);
		Pizza pizza7 = ChicagoStore.createPizza("Clam");
		System.out.println("We odrered a " + pizza7);
		Pizza pizza8 = ChicagoStore.createPizza("Veggie");
		System.out.println("We odrered a " + pizza8);
		Pizza pizza9 = SMstore.createPizza("Veggie");
		System.out.println("We odrered a " + pizza9);
		Pizza pizza10 = SMstore.createPizza("Potato");
		System.out.println("We odrered a " + pizza10);		
				
	}
}
