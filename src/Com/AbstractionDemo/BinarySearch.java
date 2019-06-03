package Com.AbstractionDemo;

public class BinarySearch {
	
	
	
	public static void searchelement(int array[],int n,int num)
	{
		int low =0;
		int high=n-1;
		
		while (low<=high)
		{
			int mid =(low+high)/2;
			
			if (array[mid]==num)
			{
				System.out.println("element found at index " + mid);
				break;
			}
			
			else if (array[mid]<num)
			{
				
				low =mid +1;
				
			}
			
			else if (array[mid]>num)
			{
				high=mid-1;
			}
			
			
			
		}
		
		if (low>high)
		{
			
			System.out.println("element is not found");

		}
		
		
	}

	public static void main(String[] args) {
		
		
		int elements[]={2,5,7,9,11,12};
		
		searchelement(elements,elements.length,9);
		
	}

}
