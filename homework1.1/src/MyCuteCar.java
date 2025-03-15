
public class MyCuteCar extends Car {
	
	private int numEngines;
	public MyCuteCar(int numEngines)
	{
		super();
		this.numEngines = numEngines;
	}
	public String startRocketEngine()
	{
		return "Rocket engine starts";
	}
	
	@Override
	public String start()
	{
		return "My car with "+numEngines+" engines starts";
	}
}
