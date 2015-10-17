
public class BstyleFactory implements Factory{
	public Color createColor(){
		Color color = new Blue();
		return color;
	}
	public Size createSize(){
		Size size = new SmallSize();
		return size;
	}
}