
public class Main 
{
	public static void main(String[] args) {
		AExtended object = new AExtended(0);
        object.method1();
        
        C objClassC = new C(10,"Test",3.14f);
        objClassC.readY(); 
        objClassC.readX();
        objClassC.readS();
        objClassC.displayX();
        objClassC.displayXYS();
	}
}
