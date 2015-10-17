
public class Rectangle extends Shape{
	public Rectangle(Factory factory){
		this.factory = factory;
		color = factory.createColor();
		size = factory.createSize();
	}
	public String toString(){
		return "Color : " + color + ",  Size : " + size + ",  Shape : Rectangle ";
	}
}