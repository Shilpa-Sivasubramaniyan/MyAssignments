package week3.day1.assignment;

public class Student extends Department {
public static void main(String[] args) {
	Student s=new Student();
	s.collegeName();
	s.collegeCode();
	s.collegeRank();
	s.deptName();
	s.studentName("Praveen");
	s.studentDept("Mech");
	s.studentID(7);
}
	public void studentName(String name) {
		System.out.println("Student name : " +name);
	}
	public void studentDept(String dept) {
		System.out.println("Student Department : " +dept);
	}
	public void studentID(int id) {
		System.out.println("Student ID : " +id );
	}
}
