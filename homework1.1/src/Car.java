
public class Car {
	//atribute private
	private String model;
	private float speed;
	private int id;
	
	//construvtor general
	public Car(String model, float speed, int id)
	{
		this.model = model;
		this.speed = speed;
		this.id = id;
	}
	
	//construvtor implicit
	public Car()
	{
		this.model = "";
		this.speed = 0.0f;
		this.id = 0;
	}

	//geteri
	
	public float getSpeed()
	{
		return speed;
	}
	
	//seteri
	
	private void setSpeed(float speed)
	{
		this.speed = speed;
	}
	
	//metode publice
	public String start()
	{
		return "car starts";
	}
	
	public String accelerate()
	{
		return "Car"+ model+" accelerates";
	}
	
	public String stop()
	{
		return "Car"+model+" stops";
	}
	
	public String startEngine()
	{
		return "engine starts";
	}
	
	public String stopEngine()
	{
		return "Engine stops";
	}
	
	public String conversion()
	{
		return "Id ul este: "+ Integer.toString(id);
		
		
	}
}
