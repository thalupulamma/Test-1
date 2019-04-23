package com.oopsconcepts.loosecoupling;

public class Test {

	public static void main(String[] args) {
		SmartWorker sw = new SmartWorker();
		Manager mn = new Manager(sw);
		mn.ManageWork();
		
		LazyWorker lw = new LazyWorker();
		Manager mn2 = new Manager(lw);
		mn2.ManageWork();
		
		ExtraordinaryWorker ew = new ExtraordinaryWorker();
		Manager mn3 = new Manager(ew);
		mn3.ManageWork();

	}

}
