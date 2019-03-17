package Com.Java.InterviewDemos;

public class Reverseintiger {
	

	public static void main(String[] args) {
		int num=98765432;
		
		int  rev=0;
		
		while (num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
System.out.println("reverse of intiger is" + rev);

int num1=8765432;


StringBuffer sb=new StringBuffer(String.valueOf(num1));
System.out.println(sb.reverse());


	}
	
	
	
	
	
	
	
	

}
