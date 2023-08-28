package org.excpetion;

public class NumberFormatc {
	
	public static void main(String[] args) {
		
	
		String a="hello";
	
		try {
			int b=Integer.parseInt(a);
		}
	
//	catch (NumberFormatException n) {
//		System.out.println(n+" Value is String");
//		n.printStackTrace();
//		
//	}
	
		catch (Exception c) {
			System.out.println("Value is not String ");
		}
	
	
	}
}
