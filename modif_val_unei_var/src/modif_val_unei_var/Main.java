package modif_val_unei_var;

public class Main
{
    public static void main(String[] args) 
    {
        int a = 5;
        System.out.println("Inainte de modif: " + a);
        modifyNo(a);
        System.out.println("Nu se modifica prin referinta: " + a);
        
        //ca sa se modifice
        a = modifyYes(a);
        System.out.println("Se modifica prin return: "+a);
    }

    public static void modifyNo(int x) 
    {
        x = 10; // Modifică doar copia lui 'x', nu variabila originală 'a'
        System.out.println("in fctie: " + x);
    }
    
    public static int modifyYes(int x)
    {
    	x = 20;
    	return x;
    }
}
