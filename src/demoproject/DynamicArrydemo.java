package demoproject;

public class DynamicArrydemo {

	public static void main(String[] args) {
		
		int i[][]=new int[3][4];
		
		i[0][0]=30;
		i[0][1]=30;
		i[0][2]=34;
		i[0][3]=66;
		
		i[1][0]=31;
		i[1][1]=35;
		i[1][2]=38;
		i[1][3]=69;
		
		i[2][0]=71;
		i[2][1]=85;
		i[2][2]=18;
		i[2][3]=69;
		
		System.out.println(i[2][3]);
		//System.out.println(i.
		System.out.println(i[0].length);
		
		//to print all values in 2d arry
		
		for (int j=0;j<i.length;j++)
		{
			for(int k=0;k<i[0].length;k++)
			{
       				System.out.print(i[j][k] + "  ");
			}
			System.out.println();
			
		}

	}
	
}


