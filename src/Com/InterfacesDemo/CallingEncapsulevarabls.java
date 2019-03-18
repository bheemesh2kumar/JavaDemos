package Com.InterfacesDemo;

import Com.Java.InterviewDemos.EncapusulationDemo;

public class CallingEncapsulevarabls {

	public static void main(String[] args) {
		
		EncapusulationDemo demo=new EncapusulationDemo();
		demo.setAccountnum(5467888);
		
		System.out.println("the account is " +  demo.getAccountnum());

	}

}
