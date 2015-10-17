package deco;

public class varnish extends interior {

 public varnish(decorator deco) {
  this.deco = deco;
 }

 public String getmessage() {
  return deco.getmessage() + " varnish";
 }

 public int cost() {
  return 13000 + deco.cost();
 }
}
