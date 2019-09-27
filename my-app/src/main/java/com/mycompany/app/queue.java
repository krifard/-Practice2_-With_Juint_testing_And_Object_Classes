package com.mycompany.app;

public class queue {
	
		public   int front, rear, capacity; 
	
		public  Object queue[]; 
		// initialize a queue with implemented array[capacity]
		queue(int c) 
		{ 
			front = rear = 0; 
			capacity = c; 
			queue = new Object[capacity]; 
		
		} 
		
		//Add element
		//Test in queueTest (test1)
		//Test in DequeueStoreTest(IndexOutOfBounds)
		 void queueEnqueue(Object data) 
		{ 
			// insert element at the rear 
		 try {
				queue[rear] = data; 
				rear++; 
			queueDisplay();
			return; 
		 }
		 catch(ArrayIndexOutOfBoundsException e )
		 {
			 System.out.println("Error of Type"+ e);
		 }
		} 

		//Delete element
		//Test in queueTest (test2)
		 void queueDequeue() 
		{ 
			// if queue is empty 
			if (front == rear) { 
				System.out.println("Queue is empty"); 
				return; 
			} 

			// shift all the elements from index 2 till rear 
			// to the right by one 
			else { 
				for (int i = 0; i < rear - 1; i++) { 
					queue[i] = queue[i + 1]; 
				} 

				// store 0 at rear indicating there's no element 
				if (rear < capacity) 
					queue[rear] = 0; 
				// decrement rear 
				rear--; 
			} 
			queueDisplay();
			return; 
		} 

		// print queue elements 
		 
		 void queueDisplay() 
		{
			if (front == rear) { 
				
				System.out.println("Queue is Empty"); 
				return; 
			} 

			// traverse front to rear and print elements 
			for (int i = front; i < rear; i++) { 
				System.out.print( this.queue[i] + ","); 
			} 
			System.out.println(" ");
			return;
			
		} 

		// print front of queue 
		 void queueFront() 
		{ 
			if (front == rear) { 
				System.out.println("Queue is Empty"); 
				return; 
			} 
			System.out.println("Front Element is " +queue[front]); 
			return; 
			
		} 
		 void queueRear() 
			{ 
				if (front == rear) { 
					System.out.println("Queue is Empty"); 
					return; 
				} 
				System.out.println("Rear Element is " +queue[rear]); 
				return; 
				
			} 
	

	



}
