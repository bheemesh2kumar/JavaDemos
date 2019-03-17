package demoproject;

public class arrydemo {

	public static int main(String[] args) 
	
	{
		int[] marks=new int[]{26,32,55,87,45,88};
		
		int max=0;
		
		for(int i=0;i<=marks.length;i++ )
		{
			if(max<marks[i])
			{
				max=marks[i];
			}
		}
		
		return max;

	}

}
