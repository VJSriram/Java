package TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		tree.put(1000, "Tom");
		tree.put(5000, "Shawn");
		tree.put(1700, "Sam");
		tree.put(1200, "Paul");
		tree.put(1400, "Frank");
		tree.put(2000, "Sai");
		
		System.out.println(tree);
		
		// tree will print lowest to highest key
		tree.forEach((k,v) -> System.out.println(" key = " + k + " value = " + v));
		
		System.out.println(tree.lastKey());
		System.out.println(tree.firstKey());
		
		// Less than 2 thousand
		Set<Integer> keysLessThan2k = tree.headMap(2000).keySet();
		System.out.println(keysLessThan2k);
		
		// Greater than 2 thousand
		Set<Integer> keysGreterthan2k = tree.tailMap(2000).keySet();
		System.out.println(keysGreterthan2k);
		
		TreeMap<String, Integer> userTree = new TreeMap<>();
		userTree.put("James", 100);
		userTree.put("Brad", 200);
		userTree.put("JT", 500);
		userTree.put("Micah", 80);
		userTree.put("Alvaro", 900);
		userTree.put("Paul", 140);
		userTree.put("Ted", 300);
		
		// Tree will print key alphabetical order
		userTree.forEach((k,v) -> System.out.println(" key = " + k + " value = " + v));

		
		// How to print keys reverse/decending order using Comparator.reverseOrder()
		TreeMap<Integer, String> tree1 = new TreeMap<>(Comparator.reverseOrder());
		tree1.put(1000, "Tom");
		tree1.put(5000, "Shawn");
		tree1.put(1700, "Sam");
		tree1.put(1200, "Paul");
		tree1.put(1400, "Frank");
		tree1.put(2000, "Sai");
		
		System.out.println(tree1);
		
		
	}

}
