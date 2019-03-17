package Com.Java.InterviewDemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountChainString {
	
	public static void main(String[] args) throws IOException 
	
	{
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String Vlaue");
		String data=br.readLine();
		System.out.println("Enter the  Charcter");
		char ch=(char)System.in.read();
		
		
		
		int couter=0;
		for(int i=0;i<data.length();i++)
		{
			if(data.charAt(i)==ch)
			{
				couter++;
			}
		}
		
		
		System.out.println("number of times of " + ch + " " + couter);
		
		
	}
	
	
	}


