package Com.javaProgrames;

public class StringBinarySearch {
	
	//{2,3,5,6,7},6
	
	
	public static void Getnumberindex(int array[],int num)
	{
		int start=0;
		int end=array.length-1;
		
		while (start<=end)
		{
			
			int mid =(start+end)/2;
			
			if(array[mid]==num)
			{
				System.out.println("element found at " + mid );
			}
			
			if(array[mid]<array[end])
			{
				start=mid+1;
			}
			else end=mid-1;
			
			if (array[start]<array[mid])
			{
				end=mid-1;
				
			}
			else 
			{
				start=mid+1;
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		
		int arrayele[]={3,5,6,7,9};
		Getnumberindex(arrayele,7);

	}

}
