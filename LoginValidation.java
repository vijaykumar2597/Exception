package org.excpetion;

public class LoginValidation {
	
	public static void main(String[] args) throws LoginException {
		
		String userName="admin";
		String password="0123";
		
		try {
			
		if(userName.equals("admin") && password.equals("01234")) {
			System.out.println("Log in SuccessFull");
		}
		else {
			throw new LoginException("invalid credentials");
		}
		}
		
//		catch(Exception a) {
//			System.out.println(a.getMessage());
//			a.printStackTrace();
//		}
//		
		
		
		catch (Exception a) {
			System.out.println(a.getMessage());
			a.printStackTrace();
		}
		
		System.out.println("Rest of the code");
	}

}
