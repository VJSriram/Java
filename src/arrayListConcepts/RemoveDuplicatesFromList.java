package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(1,1,1,3,3,3,2,2,2,4,4,5,5,6,6,7,7,8));
		
		
		//1. LinkedHashSet
		LinkedHashSet<Integer> numlist = new LinkedHashSet<Integer>(numbersList);
		
		ArrayList<Integer> removeDuplicatesFromArrayList = new ArrayList<Integer>(numlist);
		
		System.out.println(removeDuplicatesFromArrayList);
		
		//2. Dupllicate strings LinkedHashSet 
		
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Sainath", "Saibaba", "Sadguru", "Sairam", "Sainath", "Saibaba", "Sadguru", "Sairam"));
		
		LinkedHashSet<String> nlist = new LinkedHashSet<String>(namesList);
		
		ArrayList<String> removeDuplicateStrings = new ArrayList<String>(nlist);
		
		System.out.println(removeDuplicateStrings);
		
		//3. Using JDK 8 Stream
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,1,1,3,3,3,2,2,2,4,4,5,5,6,6,7,7,8));
		
		List<Integer> uniqueMarksList = marksList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueMarksList);
		
		ArrayList<String> empNamesList = new ArrayList<String>(Arrays.asList("Sainath", "Saibaba", "Sadguru", "Sairam", "Sainath", "Saibaba", "Sadguru", "Sairam"));

		List<String> empList = empNamesList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(empList);
	}

}
