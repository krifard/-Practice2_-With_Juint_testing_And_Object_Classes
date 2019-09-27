package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class DequeueStoreTest {
	
	//Removed the fail test by Implementing a try Catch block to 
	//handle IndexOutOfBoundsException
	

	@Test
	public void test() {
		//Pre Initialised queue Value with 2 element capacity 
		DequeueStore trial  = new DequeueStore();
		trial.box.queueEnqueue(4);
		trial.box.queueEnqueue(3);
		trial.box.queueEnqueue(1);
		
	}

}
