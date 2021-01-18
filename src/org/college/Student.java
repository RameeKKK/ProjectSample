package org.college;

public class Student extends Dept{
private void studentName() {
System.out.println("Student Name: Ramee");
}
private void studentDepat() {
System.out.println("Student Department: Mech");
}
private void studentID() {
System.out.println("Student ID :1234");
}
public static void main(String[] args) {
	Student a =new Student ();
	a.collegeName();
	a.collegeCode();
	a.collegeRank();
	a.hostelName();
	a.deptName();
	a.studentName();
	a.studentID();
	a.studentDepat();
}
}
