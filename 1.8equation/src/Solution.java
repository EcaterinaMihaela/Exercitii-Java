
public class Solution 
{
	 private Double x1, x2;
	    private String errorMessage;
	    
	    public Solution(Double x1, Double x2) 
	    {
	        this.x1 = x1;
	        this.x2 = x2;
	    }
	    
	    public Solution(String errorMessage) 
	    {
	        this.errorMessage = errorMessage;  //se mai pune si un cod de eroare
	    }//super -e accesat constr parintelui
	    //unchecked  --idee ul nu verifica eroareea,nu verif datele de intrare
	    //checked --ex :class not found,file not found
	    
	    public void show() 
	    {
	        if (errorMessage != null) 
	        {
	            System.out.println("Error: " + errorMessage);
	        } else if (x2 == null) 
	        {
	            System.out.println("One solution: x = " + x1);
	        } else 
	        {
	            System.out.println("Solutions: x1 = " + x1 + ", x2 = " + x2);
	        }
	    }
	}
