
public class ShapeTest {
	public static void main(String[] args) {
		Store store1 = new AStore();
		Store store2 = new BStore();
		
		Shape shape1 = store1.orderShape("Rectangle");
		System.out.println("making shape -> " +shape1);
		Shape shape2 = store1.orderShape("trapezoid");
		System.out.println("making shape -> " +shape2);
		Shape shape3 = store2.orderShape("Circle");
		System.out.println("making shape -> " +shape3);
		Shape shape4 = store2.orderShape("Square");
		System.out.println("making shape -> " +shape4);
		
	}

}
