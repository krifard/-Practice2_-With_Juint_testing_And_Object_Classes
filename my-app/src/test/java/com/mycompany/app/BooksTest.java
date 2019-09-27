package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class BooksTest {

	@Test
	//Test For Checking setterFunction of a class 
	public void test() {
		Books book = new Books();
		book.setIdentity("HarryPotter","Basav", 2020);
		Object expected[] =  {"HarryPotter","Basav", 2020};
		Object actual[] = {book.name,book.author,book.price};
		assertArrayEquals(expected,actual);
		
		
	}

}
