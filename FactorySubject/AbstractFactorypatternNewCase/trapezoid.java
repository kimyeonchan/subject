
public class trapezoid extends Shape{
	public trapezoid(Factory factory){
		this.factory = factory;
		color = factory.createColor();
		size = factory.createSize();
	}
	public String toString(){
		return "Color : " + color + ",  Size : " + size + ",  Shape : trapezoid ";
	}
}