
public class intVSInteger 
{
	 public static void main(String[] args)
	 {
	       
	        int num1 = 10;
	        int num2 = 20;  //declaratii int

	        //utilizare
	        int sumInt = num1 + num2;
	        System.out.println("Suma cu 'int': " + sumInt);

	        Integer num3 = 10;
	        Integer num4 = 20;  //declaratii Integer(care e o clasa si numerele sunt obiecte)

	        Integer sumInteger = num3 + num4;
	        System.out.println("Suma cu 'Integer': " + sumInteger);

	        // Autoboxing și unboxing--conversia intre int si Integer se face automat
	        Integer num5 = 30;  // Autoboxing: 'int' -> 'Integer'
	        int num6 = num5;    // Unboxing: 'Integer' -> 'int'
	        System.out.println("Autoboxing și unboxing: " + num6);

	        // Compararea 'int' și 'Integer'
	        if (num1 == num3) 
	        {
	            System.out.println("num1 (int) și num3 (Integer) sunt egale!");
	        }

	        // 'Integer' poate fi null
	        Integer num7 = null;
	        if (num7 == null) 
	        {
	            System.out.println("num7 este null.");
	        }

	        // Exemplu cu colecție care folosește 'Integer'
	        java.util.List<Integer> intList = new java.util.ArrayList<>();
	        intList.add(num3); // Adăugăm un 'Integer' în listă
	        System.out.println("Lista cu Integer: " + intList);
	    }
	}
