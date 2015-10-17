
public class BStore extends Store{
	public BStore(){
		factory = new BstyleFactory();	
	}
	public Shape createShape(String name){
		Shape shape = null;
		if(name.equals("Rectangle")){
			shape = new Rectangle(factory);
			return shape;
		}
		else if(name.equals("Square")){
			shape = new Square(factory);
			return shape;
		}
		else if(name.equals("trapezoid")){
			shape = new trapezoid(factory);
			return shape;
		}
		else if(name.equals("Circle")){
			shape = new Circle(factory);
			return shape;
		}
		return shape;		
	}
}