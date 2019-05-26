package Com.Java.InterviewDemos;

public class Secondmax {
	
	public static void getsecondmax(int array[])
	{
		int highest=array[0];
		int secondhig=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>highest)
			{
				secondhig=highest;
				highest=array[i];
				
			}
			else if (array[i]<highest && array[i]>secondhig)
			{
				secondhig=array[i];
				
			}
		}
		
		System.out.println("hightest number is " + highest);
		System.out.println("second hightest number is " + secondhig);
		
		
	}

	public static void main(String[] args) {
		
		int ele[]={8,9,5,3,1,4};
		
		getsecondmax(ele);
		
		
		
	}

}
