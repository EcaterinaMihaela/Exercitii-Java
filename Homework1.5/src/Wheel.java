
public class Wheel implements Mechanism
{
	@Override 
	public void Move()
	{
		System.out.println("The wheel is moving,so the car is moving!");
	}
	
	void goTo()
	{
		System.out.println("Going");
		Move();
	}
}
