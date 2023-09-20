package com.project;

//WAP to input student marks and name from user. And display the name and grade like wise
//1. above 85 , A grade.
//2. in between 85 and 75, B grade.
//3. in between 75 and 65, C grade.
//4. in between 65 and 40, D grade.
//5. below 40, E grade.

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numOfStudents = 10;

		String[] names = new String[numOfStudents];
		int[] marks = new int[10];

		for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.next();
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
		System.out.println("\nStudent Names and Grades:");
		for (int i = 0; i < 10; i++) {

			switch (marks[i]) {
				case 1:
					if (marks[i] > 85) {
						System.out.println("Name: " + names[i]);
						System.out.println("Grade: A");
					}
				case 2:
					if (marks[i] >= 75) {
						System.out.println("Name: " + names[i]);
						System.out.println("Grade: B");
					}
				case 3:
					if (marks[i] >= 65) {
						System.out.println("Name: " + names[i]);
						System.out.println("Grade: C");
					}
				case 4:
					if (marks[i] >= 40) {
						System.out.println("Name: " + names[i]);
						System.out.println("Grade: D");
					}
				case 5:
					if (marks[i] < 40) {
						System.out.println("Name: " + names[i]);
						System.out.println("Grade: E");
					}
			}
		}
	}
}

