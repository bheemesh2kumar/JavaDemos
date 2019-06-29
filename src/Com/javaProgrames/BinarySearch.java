package Com.javaProgrames;

public class BinarySearch {
	
	//23456789
	
	
	public static void getindexnumber(int array[],int x)
	{
	   int start=0;
	   int end=array.length-1;
	   
	   int mid =(start+end)/2;
	   
	   
	   while(start<end)
	   {
		  
		   
		   if (array[mid]==x)
		   {
			   System.out.println("element found at " + mid);
		   }
		   
		   
		   
		   else if  (x>array[mid])
		   {
			   
			 start=mid+1;  
			   
		   }
		   
		   else
			   
			   end=mid-1;
		   
		   mid =(start+end)/2;
		   
		   
		   
	   }
	   
	   
	   if(start>end)
	   {
		   System.out.println("element is not found");
	   }
		
		
		
	}

	public static void main(String[] args) {
		
		
		int arrayele[]={2,4,6,8,11,15};
		
		getindexnumber(arrayele,4);
		
		
		
		
		
		
		

	}

}
