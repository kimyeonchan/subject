package decorate;

public class Ice extends CondimentDecorator {

 public Ice(Beverage beverage) {
  this.beverage = beverage;
 }

 public String getDescription() {
  return beverage.getDescription() + ", Ice";
 }

 public double cost() {
  return .5 + beverage.cost();
 }
}
