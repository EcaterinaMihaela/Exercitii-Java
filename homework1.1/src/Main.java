
public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("Ford",155.5f, 234);
		 System.out.println(car1.start());            
	     System.out.println(car1.accelerate());      
	     System.out.println(car1.stop());
	     System.out.println("Speed of car1 is "+car1.getSpeed());
		
		MyCuteCar car2 = new MyCuteCar(2);
		System.out.println(car2.start());
		System.out.println(car2.startRocketEngine());
		System.out.println(car2.accelerate());
		System.out.println(car2.stop()); 
		
	}

}
