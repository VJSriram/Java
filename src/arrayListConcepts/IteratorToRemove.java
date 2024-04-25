package arrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorToRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(20);
		al.add(8);
		al.add(7);
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			if(i < 15) {
				it.remove();
			}
		}
		System.out.println(al);
	}

}
