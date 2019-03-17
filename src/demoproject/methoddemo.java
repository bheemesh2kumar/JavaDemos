package demoproject;

public class methoddemo {
	
	public static int addno(int x,int y)
	{
		return(x+y);
	}
	
	public static int subno(int x,int y)
	
	{
		return(x-y);
		
	}
	
	public static int mulno(int x, int y)
	{
		return(x*y);
	}

	public static void main(String[] args) 
	
	{

int addition=addno(5,6);
System.out.println("addition is "+ addition);

int mul=mulno(5,6);
System.out.println("addition is "+ mul);

int sub=subno(5,6);
System.out.println("addition is "+ sub);


	}

}
