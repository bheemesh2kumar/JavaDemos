package Com.Java.InterviewDemos;

public class Bubblesort {
	
	
	public static void getbubblesort(int arrynum[])
	{
		System.out.println("before sorting for array");
		
		for(int num:arrynum)
		{
			System.out.print(" "+ num);
		}
		
		
		System.out.println("After Sorting for given arry");
		int temp;
		for(int i=0;i<arrynum.length;i++)
		{
			for(int j=i+1;j<arrynum.length;j++)
			{
				if(arrynum[i]>arrynum[j])
				{
					/*temp =arrynum[i];
					arrynum[i]=arrynum[j];
					arrynum[j]=temp;*/
					arrynum[i]=arrynum[i]+arrynum[j];
					arrynum[j]=arrynum[i]-arrynum[j];
					arrynum[i]=arrynum[i]-arrynum[j];
					
					
					
				}
			}
		}
		
		for(int num:arrynum)
		{
			System.out.print(" "+ num);
		}
	}

	public static void main(String[] args) {
		
		int arrynumbers[]={66,1,15,69,9,7};
		getbubblesort(arrynumbers);
		

	}

}
