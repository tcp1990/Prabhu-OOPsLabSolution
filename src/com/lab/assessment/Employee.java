package com.lab.assessment;

public class Employee {
	private String firstName;
	private String lastName;
	private String eMail;
	private String pWord;
	private String department;

	public Employee(String fName,String lName)
	{
		firstName = fName;
		lastName = lName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getEmail()
	{
		return eMail;
	}

	public void setEmail(String email)
	{
		eMail = email;
	}

	public String getPassword()
	{
		return pWord;
	}

	public void setPassword(String password)
	{
		pWord = password;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String depMent)
	{
		department = depMent;
	}
}
