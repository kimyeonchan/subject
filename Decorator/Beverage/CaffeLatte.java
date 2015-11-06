package decorate;

public class CaffeLatte extends Beverage{
  public CaffeLatte(){
    description  = "CaffeLatte";
  }
  public double cost(){
    return 1.50;
  }
}