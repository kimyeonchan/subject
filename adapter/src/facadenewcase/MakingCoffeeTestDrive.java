package facadenewcase;

public class MakingCoffeeTestDrive {
	public static void main(String[] args) {
		Americano americano = new Americano();
		Sugar sugar = new Sugar();
		Temperature temperature = new Temperature();
		
		MakingCoffeeFacade makingCoffeeFacade =new MakingCoffeeFacade(americano, sugar, temperature);
		makingCoffeeFacade.HotOneSugarTwoshotMaking();
		makingCoffeeFacade.IceTwoSugarOnshotMaking();
		makingCoffeeFacade.IceTwoSugarTwoshotMaking();
		makingCoffeeFacade.IceNoSugarOneshotMaking();
	}
}
