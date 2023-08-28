package org.excpetion;

public class NameException {
	
	public static void main(String[] args) throws NameNotFoundException {
		
		String name=null;
		
		try {
			if(name==null||name=="") {		
				throw new NameNotFoundException("Name is invallid "+name);

			}
		
			else {
			System.out.println ("My name is= "+name);
			}
		}
		catch (NameNotFoundException n) {
			System.out.println(n.getMessage());
			n.printStackTrace();
			
		}
		System.out.println("Rest of the code");
		
	}

}
