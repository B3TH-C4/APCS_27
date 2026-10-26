/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		dwight.raiseSalary(10);
		double and = dwight.getAnnualSalary();
		System.out.println("annual salaray: " + and);


		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		jim.raiseSalary(5);
		double an = jim.getAnnualSalary();
		System.out.println("annual salary: " + an);

		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();
		pam.raiseSalary(20);
		double a = pam.getAnnualSalary();
		System.out.println("annual salary: " + a);

		Employee dihhwood = new Employee(6078, "Dihhwood", "Snail", 100);
		dihhwood.employeeToString();
	    dihhwood.raiseSalary(1);
		double ann = dihhwood.getAnnualSalary();
		System.out.println("annual salary: " + ann);
	}
}
