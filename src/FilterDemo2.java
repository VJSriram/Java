import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>(Arrays.asList("Malisandre", "Sansa", "Jon", "Daenerys", "Joffery"));
		List<String> longNames = new ArrayList<String>();
		
		//Using streams and lambda
		longNames = names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
		System.out.println(longNames);
		
		names.stream().filter(str->str.length()>6 && str.length()<8).forEach(str->System.out.println(str));
		
		names.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);
	}

}
