package deco;

public class StarDeco extends interior {

 public StarDeco(decorator deco) {
  this.deco = deco;
 }

 public String getmessage() {
  return deco.getmessage() + " StarDeco";
 }

 public int cost() {
  return 6000 + deco.cost();
 }
}
