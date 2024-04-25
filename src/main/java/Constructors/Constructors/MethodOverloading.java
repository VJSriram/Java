package Constructors.Constructors;

public class MethodOverloading {
	
	int a=0;
	int b=0;
	double c=0;
	
	void sum() 
	{
		a=10;
		b=20;
		c=20.02;
		
		System.out.println(a+b+c);
	}
	
	void sum(int a, int b) 
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
		
	}
	
	void sum(int a, int b, double c) 
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a+b+c);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(10, 40);
		mo.sum(23, 34, 45.90);
	}

}
