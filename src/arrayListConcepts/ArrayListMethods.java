package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("JavaScript");
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("PHP");
		ar1.add("Ruby");
		ar1.add("Perl");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add(".Net");
		ar2.add("Dev Ops");
		ar2.add("SQL");
		ar2.add("Docker");
		ar2.add("Kubernetes");
		ar2.add("AWS");
		
		//ar1.addAll(ar2);
		
		//System.out.println(ar1);
		
		//ar1.addAll(3, ar2);
		
		//System.out.println(ar1);
		
		//ar1.clear();
		
		//System.out.println(ar1);
		
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
		
		System.out.println(ar1.contains("Java"));
		System.out.println(ar2.contains("C#"));
		
		System.out.println(ar1.indexOf("Perl")>0);
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Naveen", "Suraj", "Kamal", "Akshay", "Rajesh"));
		System.out.println(list1);
		
		int i = list1.lastIndexOf("Kamal");
		System.out.println(i);
		
		list1.remove(2);
		System.out.println(list1);
		
		list1.remove("Rajesh");
		System.out.println(list1);
		
		//Remove even numbers
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num%2 == 0);
		System.out.println(numbers);
		
		//Remove odd numbers
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers1.removeIf(num -> num%2 != 0);
		System.out.println(numbers1);
		
		
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Tom", "Suraj", "Steve", "Raj", "Tom"));
		System.out.println(namesList);
		
		namesList.retainAll(Collections.singleton("Tom"));
		System.out.println(namesList);
		
		
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14));
		
		ArrayList<Integer> sublist = new ArrayList<Integer>(numbers2.subList(2, 9));
		System.out.println(sublist);
		
		
		ArrayList<String> newlist = new ArrayList<String>(Arrays.asList("Tom", "Suraj", "Steve", "Raj", "Tom"));
		
		Object arr[] = newlist.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object o : arr) {
			System.out.println(o);
		}
		

	}

}
