public class Main 
{
    public static void main(String[] args) 
    {
        Dog dog = new Dog();
        dog.move();
        dog.eat();
        
        FlyingAnimal bird = new Bird();
        bird.move();
        bird.eat();
        bird.fly();
    }
}
