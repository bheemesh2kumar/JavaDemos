package demoproject;

public class DemoEnum {
	public enum Days{Sunday,Monday,Thrusday}

	public static void main(String[] args) {
		Days[] daynow=Days.values();
		
		
		for(Days day:daynow)
		{
			System.out.println(day);
		}
		
		
	}

}
