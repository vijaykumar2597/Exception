package org.excpetion;

public class ArrayIndexExc {
	
	
	public static void main(String[] args) {
		
		int [] a= {2,3,34};
		
		a[0]=2;
		a[1]=3;
		a[2]=34;
		
		try {
			a[3]=54;
			
			System.out.println(a);
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of bound");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Array is not valid");
		}
		
		System.out.println("Rest of the code");
	}

}
