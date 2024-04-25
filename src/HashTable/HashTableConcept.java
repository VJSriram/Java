package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 600);
		//marks.put("Test", null);
		
		System.out.println(marks.get("Naveen"));
		System.out.println(marks.get("Peter"));
		System.out.println(marks.get("Test"));

	}

}
