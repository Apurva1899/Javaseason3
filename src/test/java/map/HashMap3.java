package map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap3 {

	public static void main(String[] args) {
		Map<String, String> hmap=new java.util.HashMap<String, String>();		
		
		System.out.println(hmap.size());  // 0
		
		hmap.put("Manager", "Ravi");
		
		hmap.put("Test Lead", "Gopi");
		
		hmap.put("Developer", "Kiran");
		
		hmap.put("Product Owner", "Mahesh");
		
		hmap.put("tester", "appu");
		
		System.out.println(hmap.size());
		
		System.out.println(hmap);
		 
		Set<Entry<String, String>> entries=hmap.entrySet();
		
		for(Entry<String, String> entry:entries) {
		
			System.out.println(entry.getKey()+" is "+entry.getValue()); 
		}
		
	}

}
