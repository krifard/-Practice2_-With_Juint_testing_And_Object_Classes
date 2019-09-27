package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class queueTest {

	// For enqueueing 
	@Test
	public void test1() {
		queue additem = new queue(2);
		additem.queueEnqueue("ram");
		additem.queueEnqueue("radha");
		Object exp[]= {"ram","radha"};
		assertArrayEquals(exp,additem.queue);
		additem.queueDequeue();
		Object expe[]= {"radha"};
		Object actual[] = {additem.queue[1]};
		assertArrayEquals(expe,actual);
	}
	// For dequeuing
	@Test
	public void test2()
	{
		queue additem = new queue(2);
		additem.queueEnqueue("ram");
		additem.queueEnqueue("radha");
		additem.queueDequeue();
		Object expected[]= {"radha"};
		Object actual[] = {additem.queue[1]};
		assertArrayEquals(expected,actual);
	}
	
	}
