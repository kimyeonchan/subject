package facadenewcase;

public class MakingCoffeeFacade {
	Americano americano;
	Sugar sugar;
	Temperature temperature;
	
	public MakingCoffeeFacade(Americano americano,Sugar sugar,Temperature temperature){
		this.americano = americano;
		this.sugar =sugar;
		this.temperature = temperature;
	}
	
	public void IceTwoSugarOnshotMaking(){
		System.out.println("Making Coffee....");
		temperature.ice();
		sugar.TwoSugar();
		americano.Oneshot();
	}
	
	public void HotOneSugarTwoshotMaking(){
		System.out.println("Making Coffee....");
		temperature.hot();
		sugar.OneSugar();
		americano.Twoshot();
	}
	
	public void IceTwoSugarTwoshotMaking(){
		System.out.println("Making Coffee....");
		temperature.ice();
		sugar.TwoSugar();
		americano.Twoshot();
	}
	
	public void IceNoSugarOneshotMaking(){
		System.out.println("Making Coffee....");
		temperature.ice();
		sugar.NoSugar();
		americano.Oneshot();
	}
}
