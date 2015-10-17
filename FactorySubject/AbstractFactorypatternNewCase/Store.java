
public abstract class Store {
	Factory factory;
	abstract public Shape createShape(String name);
	public Shape orderShape(String name){
		Shape shape = createShape(name);
		System.out.println("order complement !");
		return shape;
	}
}
