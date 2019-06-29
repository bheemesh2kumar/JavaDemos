package Com.javaProgrames;

public class Arraylarsmall {
	//4 2 9  75
	public static  void  getarraylarsmall(int array[])
	{
		int largest=array[0];
		int small=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if (array[i]>largest)
			{
				largest=array[i];
			}
			
			else if (array[i]<small)
			{
				small=array[i];
			}
			
			
			
		}
		
		System.out.println("Larget numbre is" + largest);
		System.out.println("smallest numbre is" + small);
		
	}
	
	

	public static void main(String[] args) {
		
		int arrayele[]={3,9,5,6,2,11,76};
		getarraylarsmall(arrayele);
		
		

	}

}
