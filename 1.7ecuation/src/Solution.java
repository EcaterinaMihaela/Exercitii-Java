
public class Solution 
{
	private Integer x1,x2;
	private String errorMessage;
	
	public Solution(Integer x1,Integer x2)  //constr
	{
		this.x1 = x1;
		this.x2 = x2;
	}
	
	public Solution(String errorMessage) 
	{
        this.errorMessage = errorMessage;
    }
	
	public void show()
	{
		if(errorMessage != null)
		{
			System.out.println("Error: "+ errorMessage);
		}else
		{
			System.out.println("Solutions : x1 = "+x1+",x2 = "+x2);
		}
	}
}
