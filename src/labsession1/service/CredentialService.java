package labsession1.service;

import java.util.Random;
import java.util.Scanner;

import labsession1.pojo.Employee;

public class CredentialService {

	private Employee employee;
	
	public CredentialService(Employee emp) {
		
		employee = emp;
	}

	public void setDepartment() {

		System.out.print("Please enter the department from the following\n"
				+ "1. Technical\n"
				+ "2. Admin\n"
				+ "3. Human Resource\n"
				+ "4. Legal\n");

		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();

		switch (depChoice) {
		case 1:
			employee.setDepartment("tech");
			break;
		case 2:
			employee.setDepartment("admin");
			break;
		case 3:
			employee.setDepartment("hr");
			break;
		case 4:
			employee.setDepartment("legal");
			break;
		default:
			employee.setDepartment("");
			break;
		}
		in.close();
	}

	public void generatePassword(int len) {
		String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars = capitalChars.toLowerCase();
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";
		String values = capitalChars + smallChars + numbers + symbols;

		Random rndmMethod = new Random();

		char[] password = new char[len];
		
		password[0] = smallChars.charAt(rndmMethod.nextInt(smallChars.length()));
		password[1] = capitalChars.charAt(rndmMethod.nextInt(capitalChars.length()));
		password[2] = symbols.charAt(rndmMethod.nextInt(symbols.length()));
		password[3] = numbers.charAt(rndmMethod.nextInt(numbers.length()));

		for (int i = 4; i < len ; i++) {
			password[i] = values.charAt(rndmMethod.nextInt(values.length()));
		}
		var strPwd = new String(password);
		employee.setPassword(strPwd);
	}

	public void generateEmail() {
		String eMail = employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" + employee.getDepartment() + ".abc.com";
		employee.setEmail(eMail);
	}

	public void showCredentials() {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows\r\n"
				+ "Email ---> " + employee.getEmail() + "\r\n" 
				+ "Password ---> " + employee.getPassword() + "\r\n");
	}
}
