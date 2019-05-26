package Com.Java.InterviewDemos;

public class SortingAlga {
	
	public static void getmaxnum(int array[],int x)
	{
		
		// 32457976
		
		int temp;
		
		for(int i=0;i<array.length;i++)
		{
			
			for(int j=1;j<array.length;j++)
			{
				if(array[j-1]<array[j])
				{
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
				
				
			}
			
			
			
			
			if(i==x-1)
			{
				System.out.println("your element is" + array[i]);
				
				break;
			}
			
		}
		
		
	}
	

	public static void main(String[] args) {
		
		int ele[]={2,5,7,9,8,4};
		
		//2 4,5,7,8,9
		
		getmaxnum(ele,5);
		
		
	
		
		
		
		

	}

}
