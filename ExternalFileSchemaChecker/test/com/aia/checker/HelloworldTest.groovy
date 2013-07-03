package com.aia.checker;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.net.httpserver.Authenticator.Success;

class HelloworldTest {

	@Test
	public void testPrintHelloWorld() {
		def printHelloWorld = new Helloworld();
		printHelloWorld.printHelloWorld();
		assertTrue("success",true);
	}

}
