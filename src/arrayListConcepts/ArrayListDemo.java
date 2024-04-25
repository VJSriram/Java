package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

import jdk.internal.jline.console.completer.ArgumentCompleter.ArgumentList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Default class
		//Dynamic array
		
		// Default generics:
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add("Sriram");
		ar.add(true);
		ar.add('t');
		ar.add(12.33);
		
		System.out.println(ar);	
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		//System.out.println(ar.get(-1)); //IndexOutOfBoundsException
		System.out.println(ar.size()-1);
		
		
		ar.add("Sai");
		ar.add("Ram");
		
		System.out.println(ar.size());
		//System.out.println("LI is :" + 0);
		//System.out.println("HI is :" + 8);
		
		
		// list with other collection:
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		
		System.out.println(numbers);
		
		for(int i = 0; i<=numbers.size(); i++) {
			System.out.println(i);
		}
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java", "Python", "JS", "PHP"));
		
		System.out.println(names);
		System.out.println(names.size());
		              

	}

}
