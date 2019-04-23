package com.oopsconcepts.tightcoupling.scenario1;

/*
 * Tight Coupling Example in java using concrete classes
 */
public class Manager {
	SmartWorker sw;
	LazyWorker lw;

	public Manager(SmartWorker sw, LazyWorker lw) {

		this.sw = sw;
		this.lw = lw;
	}

	public void ManageWork() {
		sw.work();
		lw.work();
	}
}
