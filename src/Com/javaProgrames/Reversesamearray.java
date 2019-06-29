package Com.javaProgrames;

public class Reversesamearray {
	
	
	public static int[] getreversearray(int array[])
	{
		int temp=0;
		int start=0;
		int end=array.length-1;
		
	while(start<end)
	{
		temp=array[start];
		array[start]=array[end];
		array[end]=temp;
		
		start++;
		end--;
	}
		
		return array;
		
	}

	public static void main(String[] args) {
		
		int arrayele[]={2,3,5,8,9,6};
		
		for(int ele:arrayele)
		{
		System.out.print(ele);	
		}
		
		int reverse[]=getreversearray(arrayele);
		System.out.print("\n");
		for(int ele1:reverse)
		{
			
			System.out.print(ele1);
		}
		

	}

}
