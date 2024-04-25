package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(1,1,3,4,5,2,4,3,3,5,6,7,9,5,6,7,9,8,10,11,12));
		
		//1. LinkedHashSet
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbersList);
		
		ArrayList<Integer> numnbersListWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
		
		System.out.println(numnbersListWithoutDuplicates);

	
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Sairam", "Sriram", "Dilip", "Rohit", "Rohit", "Rajesh", "Rajesh"));
	
		//2. LinkedHashSet
		
		LinkedHashSet<String> linkHashSet = new LinkedHashSet<String>(namesList);
		
		ArrayList<String> namesListWithoutDuplicates = new ArrayList<String>(linkHashSet);
		
		System.out.println(namesListWithoutDuplicates);
		
		
		//2. JDK 8 - stream:
		
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,1,3,4,5,2,4,3,3,5,6,7,9,5,6,7,9,8,10,11,12));
		List<Integer> uniqueMarksList = marksList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueMarksList);
		
		ArrayList<String> namesList1 = new ArrayList<String>(Arrays.asList("Sairam", "Sriram", "Dilip", "Rohit", "Rohit", "Rajesh", "Rajesh"));
		List<String> uniqueNamesList = namesList1.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueNamesList);
		

}

}
