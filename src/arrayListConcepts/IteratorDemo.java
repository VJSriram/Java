package arrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Collection
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Paul");
		ar.add("Shawn");
		ar.add("Steve");
		ar.add("Harvey");
		
		// Get the iterator
		Iterator<String> it = ar.iterator();
		
		// Print the frist item
		System.out.println(it.next());
		

		// While loop to print all the strings
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
