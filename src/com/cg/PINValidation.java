package com.cg;

import java.util.Scanner;
import java.util.regex.*;

public class PINValidation {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("PIN Validation Program");
		System.out.println("------------------------");
		String pinCode;
		String pinPattern = "^[0-9]{6}$";
		boolean repeat = true;
		while (repeat) {
			System.out.println("Select option:\n1. Enter Pin Code to check\n2. exit");
			int option = Integer.parseInt(sc.nextLine());
			switch (option) {
			case 1:
				System.out.println("Enter Pin Code Id:");
				pinCode = sc.nextLine();
				if (Pattern.matches(pinPattern, pinCode))
					System.out.println("Valid Pin Code\n");
				else
					System.out.println("Invalid Pin Code\n");
				break;
			case 2:
				repeat = false;
				break;
			}
		}
	}
}
