package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// LinkedList is a default class in Java
		// It can be used as list, Stack, Queue
		//It allows the null entry 
		// Dynamic collection
		// Hence, insertion and deletion can be easily implmented
		// It can contain duplicate elements
		// It is not synchronized(Not thread safe)
		// Manipulation is fast because we don't need any shifting. 
		
		// LinkedList Constructors:
		// LinkedList();
		// LinkedList(Collection c);
		
		LinkedList<String> names = new LinkedList<String>();
		names.add("Tom");
		names.add("Naveen");
		names.add("Sai");
		names.add("JT");
		names.add("VJ");
		names.add("Ram");
		System.out.println(names.size());
		System.out.println(names);
		System.out.println(names.get(0));
		//System.out.println(names.get(7)); // IndexOutOfBoundsException
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		names.add(4, "Steve");
		System.out.println(names);
		
		names.add(2, "Alvaro");
		System.out.println(names);
		
		names.remove(2);
		System.out.println(names);
		
		LinkedList<String> users = new LinkedList<String>();
		users.add("Anjali");
		users.add("Tiffeny");
		
		names.addAll(users);
		System.out.println(names);
		
		names.addFirst("Kamala");
		System.out.println(names);
		
		names.addLast("Shivin");
		System.out.println(names);
		
		names.remove(3);
		System.out.println(names);
		
		names.removeAll(users);
		System.out.println(names);
		
		names.removeFirst();
		names.removeLast();
		System.out.println(names);
		
		names.clear();
		System.out.println(names);
		
		LinkedList<String> lang = new LinkedList<String>();
		System.out.println(lang.size());
		
		lang.add("Java");
		lang.add(".Net");
		lang.add("C#");
		lang.add("Python");
		lang.add("JavaScript");
		lang.add("Ruby");
		
		System.out.println(lang.size());
		
		// Reverse the linkedList
		Iterator<String> itr = lang.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// traverse using forEach loop
		
		for(String e : lang) {
			System.out.println(e);
		}
		
		// Sort:
		Collections.sort(lang);
		System.out.println(lang);

	}

}
