package hashMapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// SynchronizedMap method in collections class:
		
		Map<String, String> map1 = new HashMap<String, String>();
		
		map1.put("1", "Sairam");
		map1.put("2", "Sriram");
		map1.put("3", "JaiSriram");
		
		//Create synchronizedMap:
		Map<String, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);
		
		// ConcurrentMap: It does not throw any ConcurrentModificationException
		
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
		
		concurrentMap.put("A", "Java");
		concurrentMap.put("B", ".Net");
		concurrentMap.put("C", "C#");
		
		System.out.println(concurrentMap.get("B"));
		

	}

}
