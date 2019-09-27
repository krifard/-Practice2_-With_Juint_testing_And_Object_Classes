package com.mycompany.app;


public class begin extends Animal{

//	 enum weapons{
//		Venom, claws,RawStrength, Bite
//	};
		public static void main(String[] args) 
		{ 
			// Create a queue of capacity 4 
//			queue q = new queue(4); 
//
//			// print Queue elements 
//			q.queueDisplay(); 
//
//			// inserting elements in the queue 
//			q.queueEnqueue(20); 
//			q.queueEnqueue(30); 
//			q.queueEnqueue(40); 
//			q.queueEnqueue(50); 
//
//			// print Queue elements 
//			q.queueDisplay(); 
//
//			// insert element in the queue 
//			q.queueEnqueue(60); 
//
//			// print Queue elements 
//			q.queueDisplay(); 
//
//			q.queueDequeue(); 
//			q.queueDequeue(); 
//			System.out.println("after two node deletion"); 
//
//		
//			// print front of the queue 
//			q.queueFront(); 
//			q.queueRear();
			
			// Implementing the practice assignment 2 ( last part) 
			
			DequeueStore store = new DequeueStore();
			Animal Dog = new Animal();
			Dog.setSkills("Dog", 5);
			Animal Cat = new Animal();
			Cat.setSkills("Cat", 5);
			Animal Lion = new Animal();
			Lion.setSkills("Lion", 5);
			Animal Mouse = new Animal();
			Mouse.setSkills("Mouse", 5);
			
			
			
			store.box.queueEnqueue(Dog.name); 
			store.box.queueEnqueue(Cat.name); 
			store.box.queueEnqueue(Lion.name); 
			store.box.queueEnqueue(Mouse.name); 
			store.box.queueEnqueue(10); 
			
//			store.box.queueDequeue(Integer.valueOf(10));
			
			
		} 
	}


