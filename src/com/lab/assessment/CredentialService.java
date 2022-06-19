package com.lab.assessment;

import java.util.*;

public class CredentialService extends Employee {
	
	public CredentialService(String fName, String lName)
	{
		super(fName, lName);
	}

	public void setDepartment() {
		
		System.out.print("Please enter the department from the following\n"
				+ "1. Technical\n"
				+ "2. Admin\n"
				+ "3. Human Resource\n"
				+ "4. Legal\n");
		
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		switch(depChoice)
		{
		case 1:
			setDepartment("tech");
			break;
		case 2:
			setDepartment("admin");
			break;
		case 3:
			setDepartment("hr");
			break;
		case 4:
			setDepartment("legal");
			break;
		default:
			setDepartment("");
			break;
		}
		in.close();
	}
	
	public void generatePassword()
	{
		int len = 8;
		String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars = capitalChars.toLowerCase();
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";		
		String values = capitalChars + smallChars + numbers + symbols;
		
		Random rndm_method = new Random();

		char[] password = new char[len];

		for (int i = 0; i < len; i++)
		{
			password[i] = values.charAt(rndm_method.nextInt(values.length()));
		}
		var strPwd = new String(password);
		setPassword(strPwd);
	}
	
	public void generateEmail()
	{
		String eMail = getFirstName().toLowerCase() + getLastName().toLowerCase() + "@" + getDepartment() + ".company.com";
		setEmail(eMail);
	}
	
	public void showCredentials()
	{
		System.out.println("Dear "+ getFirstName() +" your generated credentials are as follows\r\n"
				+ "Email ---> "+ getEmail() +"\r\n"
				+ "Password ---> "+ getPassword() + "\r\n");
	}
}
