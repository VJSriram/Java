package arrayListConcepts;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 : Collections.synchronizedList
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		
		namesList.add("Tom");
		namesList.add("Steve");
		namesList.add("Shawn");
		
		// add, remove - we dont need explicit synchronization
		
		// to fetch/traverse the values from the list - we have to use explicit synchronization
		
		synchronized (namesList) {
			
			Iterator<String> it = namesList.iterator();
			
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			
		} 
		
		System.out.println("_________________");
		
		// 2. copyOnWriteArrayList -- its a class : Thread-safe/synchronized already. 
		
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Sai");
		empList.add("Ram");
		empList.add("Steve");
		
		// we don't need explicit synchronization for any operation : add/remove/traverse
		
		Iterator<String> it = empList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}



}
