package Studentdatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private  int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	// Constructor: prompt user t enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student frst name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();			
	}
	// Generate an ID
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	// Enroll in course
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
		System.out.print("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q")) {
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
			}
		else {
			System.out.println("BREAK!");
			break;
			}
		}while (1 != 0);
	}
	
	// view balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	// Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	// Show status
	public String toStrng() {
		return "Name: " + firstName + "" + lastName+
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourse Enrolled:" + courses +
				"\nBalance: $" + tuitionBalance;
	}
 
}
