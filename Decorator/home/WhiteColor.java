package deco;

public class WhiteColor extends interior {

 public WhiteColor(decorator deco) {
  this.deco = deco;
 }

 public String getmessage() {
  return deco.getmessage() + " WhiteColor";
 }

 public int cost() {
  return 5000 + deco.cost();
 }
}
