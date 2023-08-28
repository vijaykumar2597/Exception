package org.excpetion;

public class AirthmeticExcption {

	public static void main(String[] args) {

		int a = 100;
		int b = 0;

//		try {
//			int c = a / b;
//			System.out.println(c);
//		}
//
//		catch (ArithmeticException ae) {
//			System.out.println(ae + " Value is zero");
//			ae.printStackTrace();
//
//		}
//
//		System.out.println("Rest of the code");

		try {

			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e + "value is zero");
			e.printStackTrace();
		}

		finally {
			System.out.println("Excpetion Handled");
		}
		System.out.println("Rest of the code ");

	}

}
