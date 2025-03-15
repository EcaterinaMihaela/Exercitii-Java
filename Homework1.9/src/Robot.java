class Robot implements Device, Mechanism, Computer 
{
    @Override
    public void on() {
        System.out.println("Robotul este pornit.");
    }

    @Override
    public void off() {
        System.out.println("Robotul este oprit.");
    }

    @Override
    public void Move() {
        System.out.println("Robotul se deplasează.");
    }

    @Override
    public void boot() {
        System.out.println("Robotul inițializează sistemul de operare.");
    }

    // Metodă specifică clasei Robot
    public void performTask() {
        System.out.println("Robotul execută o sarcină.");
    }
}
