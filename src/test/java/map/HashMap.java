package map;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {

		Map<Integer, String> hmap=new java.util.HashMap<Integer, String>();
		System.out.println(hmap.size()); //0
		hmap.put(100, "ravi");
		
        hmap.put(101, "Gopi");
		
		hmap.put(102, "Kiran");
		
		hmap.put(103, "Mahesh");
		
		System.out.println(hmap.size());
		
		System.out.println(hmap);
		
		
		
	}

}
