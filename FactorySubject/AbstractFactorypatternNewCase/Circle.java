
public class Circle extends Shape{
	public Circle(Factory factory){
		this.factory = factory;
		color = factory.createColor();
		size = factory.createSize();
	}
	public String toString(){
		return "Color : " + color + "  Size : " + size + ",  Shape : Circle ";
	}
}
