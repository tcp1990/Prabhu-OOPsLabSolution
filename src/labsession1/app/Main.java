package labsession1.app;

import labsession1.pojo.Employee;
import labsession1.service.CredentialService;

public class Main
{

	public static void main(String[] args)
	{

		Employee employee = new Employee("Harshit", "Choudary");
		CredentialService service = new CredentialService(employee);
		
		do 
		{
			service.setDepartment();
			if (employee.getDepartment() == null || employee.getDepartment() == "") 
			{
				System.out.println("Please select valid department.");
			}
			
		}while(employee.getDepartment() == null || employee.getDepartment() == "");
		
		service.generateEmail();
		service.generatePassword(8);
		service.showCredentials();
	}
}
