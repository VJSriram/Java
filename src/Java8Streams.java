import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(10,15,20,25,30,35,40));
		List<Integer> evenNumbersList = new ArrayList<Integer>();
		
		// Without using streams
		
		for(Integer n : numbersList) {
			
			if(n%2==0) {
				evenNumbersList.add(n);
			}
			
			//System.out.println(evenNumbersList);
		}
		
		
		// With Streams
		
		//numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
		//System.out.println(evenNumbersList);
		
		numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	}

}
