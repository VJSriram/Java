package hashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class ConvertHashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 10000);
		compMap.put("Walmart", 60000);
		compMap.put("Amazon", 70000);
		compMap.put("Facebook", 90000);
		compMap.put("Alphabet", 100000);
		
		System.out.println("Comp map size " + compMap.size());
		
		
		Iterator it = compMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry pairs = (Map.Entry)it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}
		
		System.out.println("------------");
		
		// Convert hashMap keys into ArrayList:
		List<String> compNameList = new ArrayList<String>(compMap.keySet());
		System.out.println(compNameList.size());
		
		for(String t : compNameList) {
			System.out.println(t);
		}
		
		System.out.println("------------");
		
		//Convert hashMap values into ArrayList:
		List<Integer> compValueList = new ArrayList<Integer>(compMap.values());
		System.out.println(compValueList.size());
		
		for(Integer e : compValueList) {
			System.out.println(e);
		}
		
		System.out.println("------------");
		
		//Using JDK 8 Lambda -> 
		compMap.forEach((k,v) -> System.out.println("Key = " + k + "  Value = " + v));

	}

}
