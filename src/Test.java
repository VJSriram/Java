@FunctionalInterface
interface Cab 
{
	public void bookCab();
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cab cab=()->System.out.println("Ola cab is booked ....");
		cab.bookCab();
	}

}
