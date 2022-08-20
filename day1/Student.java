package week3.day1;

public class Student extends Department {
	public void studentName(String name) {
		System.out.println("Student Name: " +name);
	}
	public void studentDept() {
		System.out.println("Student Department: ECE");
	}
	public void studentId() {
		System.out.println("Student ID: 3452657876");
	}
	
	public static void main(String[] args) {
		Student dept = new Student();
		dept.collegeName();
		dept.collegeCode();
		dept.collegeRank();
		dept.deptName();
		dept.studentName("Anita");
		dept.studentDept();
		dept.studentId();
		
	}
}
