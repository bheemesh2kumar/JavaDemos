package demoproject;
import javax.swing.JOptionPane;

public class dowhiledemo1 {

	public static void main(String[] args) 
	{
		String command;
		boolean iswrongcommand;
		
		do
		{
			command=JOptionPane.showInputDialog("enter the command");
			
			if(command.equals("Hello"))
			{
				System.out.println("you entered right command");
				iswrongcommand=false;
			}
			
			else
				iswrongcommand=true;
			
		}
		while(iswrongcommand);
		
		System.out.println("programe ended");
		

	}

}
