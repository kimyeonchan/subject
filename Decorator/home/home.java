package deco;

public class home {
	public static void main(String[] args) {
		decorator d1 = new door();
		d1 = new varnish(d1);
		d1 = new WhiteColor(d1);
		d1 = new StarDeco(d1);
		System.out.println(d1.getmessage()+ " 총 " + d1.cost() +"원 입니다");
		
		decorator d2 = new chair();
		d2 = new BlackColor(d2);
		d2 = new varnish(d2);
		System.out.println(d2.getmessage()+ " 총 " + d2.cost() +"원 입니다");
		
		decorator d3 = new table();
		d3 = new WhiteColor(d3);
		d3 = new varnish(d3);
		d3 = new StarDeco(d3);
		System.out.println(d3.getmessage()+ " 총 " + d3.cost() +"원 입니다");
		
	}
}
