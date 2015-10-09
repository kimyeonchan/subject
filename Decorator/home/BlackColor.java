package deco;

public class BlackColor extends interior {

 public BlackColor(decorator deco) {
  this.deco = deco;
 }

 public String getmessage() {
  return deco.getmessage() + " BlackColor";
 }

 public int cost() {
  return 5000 + deco.cost();
 }
}
