package com.csi.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class TestAppTest {

	TestApp testApp;
	TestInfo testInfo;
	TestReporter testReporter;
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter)
	{
		this.testInfo=testInfo;
		this.testReporter=testReporter;
		testApp=new TestApp();
		testReporter.publishEntry("Running "+testInfo.getDisplayName()+" with tags "+testInfo.getTags());
	}
	
	@Test
	@DisplayName("i am Add method")
	@Tag("Math")
	void testAdd() {
		assertEquals(100, testApp.add(50,50),"Should return positive value");
		//System.out.println("Running "+testInfo.getDisplayName()+" with tags "+testInfo.getTags());
	}
	
	@Test
	@Tag("Math")
	@DisplayName("i am subtract method")
	void testSubtract()
	{
		//testReporter.publishEntry("Running "+testInfo.getDisplayName()+"with tags "+testInfo.getTags());
		assertEquals(0, testApp.subtract(50,50),"should return zero value");
	}

}
