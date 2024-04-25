package hashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// no order - no indexing
		//stores values - key-value <k,v>
		//Key can not be duplicate
		// Can store n number of null values but only one null key
		// HashMap is not thread safe/synchronized
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington, D.C");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "France");
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		
		capitalMap.remove("France");
		
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("UK"));
		
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("France"));
		
		
		//iterator: over the keys : by using keySet()
		Iterator<String> it = capitalMap.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("Key = " + key + "   Value = " + value);
		}
		
		System.out.println("------------");
		
		//iterator : over the set (pair): by using entrySet
		
		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
		
		while(it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("Key = " + entry.getKey() + " and value = " + entry.getValue());
		}
		
		System.out.println("------------");
		
		// iterate hashmap using java 8 for each and lamba
		capitalMap.forEach((k,v) -> System.out.println("Key = " + k + "and Value = " + v));

	}

}
