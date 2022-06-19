package com.greatlearning.oops.lab.assignment.service;

import java.util.Random;

import com.greatlearning.oops.lab.assignment.models.Employee;

public class CredentialService {

	public String generatePassword() {
		int length = 8;
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$%^&*_+/.?<>";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[length];

		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 4; i < length; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}

		String pass = "";

		for (int i = 0; i < length; i++) {
			pass += password[i];
		}

		return pass;
	}

	public String generateEmailAddress(Employee employee, String department, String company) {

		String firstName = employee.getFirstName().toLowerCase();
		String lastName = employee.getLastName().toLowerCase();

		String email = String.format("%s%s@%s.%s.com", firstName, lastName, department, company);
		return email;

	}

	public void ShowCredentials(String firstName, String email, String password) {
		System.out.println(String.format("Dear %s your generated credentials are as follows : ", firstName));
		System.out.println(String.format("Email --> %s", email));
		System.out.println(String.format("Password --> %s", password));
	}

}
