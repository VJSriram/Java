package arrayListConcepts;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// By default virtual capacity is 10 (VC = 10)
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		System.out.println(ar.size()); // Physical capacity = 0
		
		ar.add(111);
		
		System.out.println(ar.size()); // PC = 1
		
		ar.add(111);
		ar.add(111);
		ar.add(111);
		
		System.out.println(ar.size()); // PC = 4

	}

}
