package Map;
import java.util.Map;
import java.util.HashMap;

public class Employee {
	public static String show() {
	Map<Integer, String> map = new HashMap<Integer, String>(); 
	
	map.put(10,"Payal");
	map.put(11,"Vaishnavi");
	map.put(12,"Sheetal");
	
	System.out.println(map.get(12));
	return map.get(12);
	

		
	}
}


