package com.lab.assessment;

public class Main {

	public static void main(String[] args) {
		
		CredentialService employee = new CredentialService("Harshit", "Choudary");
		employee.setDepartment();
		
		if(employee.getDepartment() == null || employee.getDepartment() == "" )
		{
			System.out.println("Please select valid department.");
			return;
		}
		
		employee.generateEmail();
		employee.generatePassword();
		employee.showCredentials();
	}
}
