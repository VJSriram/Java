package Constructors.Constructors;


/*

Constructor is special kind of method. 
Constructor name should be same as class name. 
Constructor will not return any value. 
Constructor will be invoked at the time of object creation.(No need to call constructor explicitly)
Constructor will take the parameters just like a method
Constructor is used for initialize the values. 

 */
public class ConstructorOverloading {
	
	int a=0;
	int b=0;
	double c=0;
	
	ConstructorOverloading()
	{
		a=10;
		b=20;
		c=20.5;
	}
	
	ConstructorOverloading(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	}
	
	ConstructorOverloading(int x, double y)
	{
		a=x;
		c=y;
	}
	
	ConstructorOverloading(int x, int y, double z)
	{
		a=x;
		b=y;
		c=z;
	}
	
	public void display() 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading co = new ConstructorOverloading(); // First 
		co.display();
		
		ConstructorOverloading co1 = new ConstructorOverloading(10,20); // Second
		co1.display();
		
		ConstructorOverloading co2 = new ConstructorOverloading(100,20.20); // Third
		co2.display();
		
		ConstructorOverloading co3 = new ConstructorOverloading(122,232,22.33); // Fourth
		co3.display();
	}

}
