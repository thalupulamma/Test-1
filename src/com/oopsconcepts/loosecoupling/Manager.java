package com.oopsconcepts.loosecoupling;

/*
 * Loose Coupling in java example
 */

class Manager {

	IWorker worker;
	public Manager(IWorker worker) {

		this.worker=worker;
		
	}

	public void ManageWork() {	
		
		this.worker.work();
	}

}
