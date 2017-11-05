package com.witontek.ehospital2.base;

import java.util.Map;

public class TestCase {
	
	private String caseName;
	private String expectedResults;
	private Map<String,String> testData;
	
	public TestCase(String caseName,String expectedResults,Map<String,String> testData){
		this.caseName=caseName;
		this.expectedResults=expectedResults;
		this.testData=testData;
	}

	public String getCaseName(){
		return caseName;
	}
	
	public String getExpectedResults(){
		return expectedResults;	
	}
	
	public Map<String,String> getTestData(){
		return testData;	
	}
}
