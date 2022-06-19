package com.greatlearning.oops.lab.assignment.driver;

import java.util.Scanner;

import com.greatlearning.oops.lab.assignment.models.Employee;
import com.greatlearning.oops.lab.assignment.service.CredentialService;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee("Honey", "Mevada");

		Scanner sc = new Scanner(System.in);
		int input = 0;
		do {

			System.out.println("Please select the department from the following : \n" + "1.Technical \n" + "2.Admin \n"
					+ "3.Human Resource \n" + "4.Legal \n");

			input = sc.nextInt();
			String department;
			String companyName;
			String generatedPassword;
			String generatedEmail;
			CredentialService credentialService = new CredentialService();

			switch (input) {
			case 1:
				department = "tech";
				System.out.println("Please enter your company name : ");
				companyName = sc.next();
				generatedPassword = credentialService.generatePassword();
				generatedEmail = credentialService.generateEmailAddress(employee, department, companyName);
				credentialService.ShowCredentials(employee.getFirstName(), generatedEmail, generatedPassword);
				break;
			case 2:
				department = "adm";
				System.out.println("Please enter your company name : ");
				companyName = sc.next();
				generatedPassword = credentialService.generatePassword();
				generatedEmail = credentialService.generateEmailAddress(employee, department, companyName);
				credentialService.ShowCredentials(employee.getFirstName(), generatedEmail, generatedPassword);
				break;
			case 3:
				department = "hr";
				System.out.println("Please enter your company name : ");
				companyName = sc.next();
				generatedPassword = credentialService.generatePassword();
				generatedEmail = credentialService.generateEmailAddress(employee, department, companyName);
				credentialService.ShowCredentials(employee.getFirstName(), generatedEmail, generatedPassword);
				break;
			case 4:
				department = "legal";
				System.out.println("Please enter your company name : ");
				companyName = sc.next();
				generatedPassword = credentialService.generatePassword();
				generatedEmail = credentialService.generateEmailAddress(employee, department, companyName);
				credentialService.ShowCredentials(employee.getFirstName(), generatedEmail, generatedPassword);
				break;
			default:
				System.out.println("Please enter valid department.");
			}
		} while (input != 1 && input != 2 && input != 3 && input != 4);
		sc.close();
	}

}
