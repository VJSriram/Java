package arrayListConcepts;

import java.util.ArrayList;

public class ArrayListMethods1 {

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
		
		ar1.addAll(ar2);
		System.out.println(ar1);
		
		ar2.removeAll(ar1);
		System.out.println(ar2);
		
		ar2.clear();
		System.out.println(ar2);
		
		System.out.println(ar1.contains("Java"));
		System.out.println(ar2.contains("Java"));
		
		//Common methods
		/*
		clear();
		add();
		addAll();
		remove();
		removeAll();
		retain();
		retainAll();
		contains();
		containsAll();
		size();
		*/

	}

}
