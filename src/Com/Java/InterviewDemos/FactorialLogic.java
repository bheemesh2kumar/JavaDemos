package Com.Java.InterviewDemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class FactorialLogic {
	
	
	public static int findfact(int fact)
	{
		
		//4321=24
		int tot=1;
		
		for(int i=1;i<=fact;i++)
		{
			tot=i*tot;
		}
		
		
		return tot;
	}
	
	
	

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Factorial number");
		String factnum=bf.readLine();
		int number=Integer.parseInt(factnum);
		
		
		
		
		int fctoresult=findfact(number);
		
		System.out.println("the factorial of number" +fctoresult );
		
	}

}
