package map;

import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		Map<String, String> hmap=new java.util.HashMap<String, String>();		
		
		System.out.println(hmap.size());  // 0
		
		hmap.put("Manager", "Ravi");
		
		hmap.put("Test Lead", "Gopi");
		
		hmap.put("Developer", "Kiran");
		
		hmap.put("Product Owner", "Mahesh");
		
		System.out.println(hmap.size());
		
		System.out.println(hmap);
		 
		
		
	}

}
