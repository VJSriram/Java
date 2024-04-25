package SetConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("Alpha");
		hs.add("Testing");
		hs.add("Beta");
		hs.add("Alpha"); // duplicates elements not allowed
		hs.add(null);
		
		System.out.println(hs);

		System.out.println(hs.contains("Testing"));
		
		
		// for each loop
		for(String e : hs) {
		    System.out.println(e);
		}
		
		// Iterator
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
					System.out.println(it.next());
		}
		
		hs.remove("Beta");
		System.out.println(hs);
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,3,4,5,6,8,9,10}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,2,3,5,6,0,9}));
		
		// Get the union:
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		
		System.out.println("---------------");
		
		// Get the intersection:
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);
		
		System.out.println("---------------");
		
		Set<Integer> difference = new HashSet<Integer>(first);
		difference.removeAll(second);
		System.out.println(difference);
	}

}
