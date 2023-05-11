package package2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

    public class MapsImpl {
    public static void main(String[] args) {
	HashMap<String, Integer> weatherMap = new  HashMap<String, Integer>();
		
	weatherMap.put("Chennai", 35);
	weatherMap.put("Gurugram",60);
	weatherMap.put("Mumbai", 22);
	weatherMap.put("Pune", 46);
	System.out.println("Gurugram temperature today is : "
				         + weatherMap.get("Gurugram"));
	
    System.out.println("\nThe elements of Hashmap are ");
	for (Entry<String, Integer> m : weatherMap.entrySet()) {
		System.out.println(m.getKey() + " " + m.getValue());
	}
    
    LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();           
    map.put(11,"Ammu");    
    map.put(12,"Vijju");    
    map.put(13,"Ravi");    
    System.out.println("\nThe elements of LinkedHashmap are ");
     System.out.println("Keys: "+map.keySet()) ;
      
     System.out.println("Values: "+map.values());
      
     System.out.println("Key-Value pairs: "+map.entrySet());  
    
    }
    }
    

   