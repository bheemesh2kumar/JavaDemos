package Com.Java.InterviewDemos;

public class EachStringCount {

	public static void main(String[] args) {
		
		//fibnaci series 0 1 1 2 3 5 8 13 21 etc
		//0 1 2 3 6 11 20 
		
		int num1=0;
		int num2=1;
		int num3=2;
		
		for(int i=1;i<=10;i ++)
		{
			System.out.print(num1+ "  ");
			int sum=num1+num2+num3;
			num1=num2;
			num2=num3;
			num3=sum;
		}
		
	}

}
