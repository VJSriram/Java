package arrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("a");
		arrayList.add("b");
		
		Iterator<String> it = arrayList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			arrayList.add("c"); // ConcurrentModificationException
		}

	}

}
