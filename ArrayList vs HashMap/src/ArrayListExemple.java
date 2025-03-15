import java.util.ArrayList;
public class ArrayListExemple 
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		System.out.println(list.get(1)); //afiseaza banana
		
		//iterare prin lista
		for(String fruit:list)
		{
			System.out.println(fruit);
		}
	}
}
