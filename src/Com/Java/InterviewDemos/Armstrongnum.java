package Com.Java.InterviewDemos;

public class Armstrongnum {
	
	//153 -1c+5C+3C=153=armstrongn umber
	
	public static void isarmstrong(int num)
	{
		int r;
		int sum=0;
		int t=num;
		
		
		
		while(num>0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		
		
		if(t==sum)
		{
			System.out.println("your number is " + t + " " + "amstrongnumber" );
		} 
		
		else
		{
			System.out.println("your number is not a amstrong");
		}
		
		
	}

	public static void main(String[] args) {
		
		isarmstrong(153);
		
		

	}

}
