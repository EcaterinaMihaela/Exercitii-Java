public class Main 
{
    public static void main(String[] args) {
        // Instanțierea unui obiect Robot
        Robot myRobot = new Robot();

        // Apelarea metodelor definite în interfețe
        myRobot.on();
        myRobot.boot();
        myRobot.Move();
        myRobot.performTask();
        myRobot.off();
    }
}