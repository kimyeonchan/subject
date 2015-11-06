
public class AstyleFactory implements Factory{
	public Color createColor(){
		Color color = new Red();
		return color;
	}
	public Size createSize(){
		Size size = new BigSize();
		return size;
	}
}
