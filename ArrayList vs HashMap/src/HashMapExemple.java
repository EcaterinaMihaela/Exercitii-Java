import java.util.HashMap;
public class HashMapExemple 
{
	public static void main(String[] args)
	{
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Apple", 10);
		map.put("Banana", 5);
		map.put("Orange",8);
		
		//acces rapid prin cheie
		System.out.println(map.get("Banana"));  //afiseaza 5
		
		//iterare
		for(String key:map.keySet())
		{
			System.out.println(key+" : "+map.get(key));
		}
	}
}
