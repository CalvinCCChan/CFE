package com.aia.checker;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.net.httpserver.Authenticator.Success;

class HelloworldTest {

	@Test
	void testPrintHelloWorld() {
		def printHelloWorld = new Helloworld();
		printHelloWorld.printHelloWorld();
		assertTrue("success",true);
	}
	
	@Test
	void testRepeatAdd(){
		def printHelloWorld = new Helloworld();
		def result = printHelloWorld.repeatAdd(3);
		assertEquals("Not the Same", 6,result);
	}
	
	@Test
	void testRepeatAdd_equal10(){
		def printHelloWorld = new Helloworld();
		def result = printHelloWorld.repeatAdd(4);
		assertEquals("Not the Same", 10,result);
	}
	
	@Test
	void testRepeatAdd_equalDefault(){
		def printHelloWorld = new Helloworld();
		def result = printHelloWorld.repeatAdd();
		assertEquals("Not the Same", 15,result);
	}
}
