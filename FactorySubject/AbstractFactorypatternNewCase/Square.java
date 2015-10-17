
public class Square extends Shape{
	public Square(Factory factory){
		this.factory = factory;
		color = factory.createColor();
		size = factory.createSize();
	}
	public String toString(){
		return "Color : " + color + "  Size : " + size + ",  Shape : Square ";
	}
}