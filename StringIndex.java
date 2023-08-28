package org.excpetion;

public class StringIndex {

	public static void main(String[] args) {

		String word = "OneSoft";
		

		try {
			System.out.println(word.charAt(7));
		} 
		
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("String is out bound");
			e.printStackTrace();
		} 
		
		finally {
			System.out.println("String is bound");
		}
		System.out.println("Rest of the code is excuted");
	}

}
