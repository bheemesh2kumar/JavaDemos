package Com.Java.InterviewDemos;

import java.util.Arrays;
import java.util.Scanner;

public class Reversearry {
	

	public static void main(String[] args) {
		
	/*	Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the size of array");
		int num=sc.nextInt();
		
		int Array[]=new int[num];
		
	System.out.println("Enter array elements");
	
	for(int i=0;i<num;i++)
	{
		Array[i]=sc.nextInt();
	}*/
		int Array[]=new int[]{1,2,3,4,6};
		
		for(int ele:Array)
		{
			System.out.print(ele);
		}
		
		System.out.println("");
		
	int temp;
	int start=0;
	int end=Array.length-1;
	while(start<end)
	{
		temp=Array[start];
		Array[start]=Array[end];
		Array[end]=temp;
		start++;
		end--;
	}
	
	
	System.out.println("the reverse order is ");
	for(int k =0;k<Array.length;k++)
	{
		System.out.print(Array[k]);
	}
	
	
	
	}
	}
			

