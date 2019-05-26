package Com.Java.InterviewDemos;

import java.util.HashMap;

public class Duplicaeintwoarrys {

	public static void main(String[] args) {
		

	}
	
	
	public static void getduplicatevalues(int arry1[],int arry2[])
	{
		HashMap<Integer,Integer> hashref=new HashMap<Integer,Integer>();
		
		int counter=0;
		for(int i=0;i<arry1.length;i++)
		{
			for(int j =0;j<arry2.length;j++)
			{
			  if (arry1[i]==arry2[j])
			  {
				  hashref.put(arry1[i], ++counter);
			  }
			  else
			  {
				  
			  }
				
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
