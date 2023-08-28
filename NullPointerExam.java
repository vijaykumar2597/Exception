package org.excpetion;

public class NullPointerExam {

	public static void main(String[] args) {

		String word = null;

		try {
			System.out.println(word.toUpperCase());
		}

		catch (NullPointerException n) {
			System.out.println(word + " Value is null");
			n.printStackTrace();
		} 
		
		finally {
			System.out.println("Excption Handled");
		}
		System.out.println("Rest of the code");
	}

}
