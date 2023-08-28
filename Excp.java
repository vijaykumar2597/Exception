package org.excpetion;

public class Excp {

	public static void main(String[] args) {

		String word = "";
		
		

		int num = 10;

		try {
			int len = word.length();

			int a = num % len;
		} 
		
		catch (NullPointerException n) {
			System.out.println("Value is null");
			n.printStackTrace();
		}

		catch (ArithmeticException a) {
			System.out.println("cant Divided by  zero");
			a.printStackTrace();
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}

}
