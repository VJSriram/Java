package arrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("Tom");
		studentList.add("Amy");
		studentList.add("Lisa");
		studentList.add("Shawn");
		
		//Typical for loop 
		for(int i = 0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
	
		}
		
		System.out.println("---------");
		
		// for each loop:
		/*for(type var : array)
		{
			statements using var;
		}*/
		for(String s : studentList) {
			System.out.println(s);
		}
		
		System.out.println("---------");
		
		//JDK 8 - streams with lamda:
		studentList.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("---------");
		
		// Iterator:
		Iterator<String> it = studentList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
