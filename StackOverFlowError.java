package org.excpetion;

public class StackOverFlowError {
	
	public void callA() {
		callB();
		
	}
	
	public void callB() {
		callA();
	}

	public static void main(String[] args) {
		
		StackOverFlowError s=new StackOverFlowError();
		
		s.callA();
		
		
	}
}
