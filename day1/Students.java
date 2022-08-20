package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student ID is : "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Studen ID: "+id+", StudentName: "+name );
	}
	public void getStudentInfo(String emailID, long PhoneNumber) {
		System.out.println("Student Email ID : " +emailID+", Student Phone Number : "+PhoneNumber);
	}
	public static void main(String[] args) {
		Students stud = new Students();
		stud. getStudentInfo(324354);
		stud.getStudentInfo(324354, "Anita");
		stud.getStudentInfo("anita.gfrtds@gmail.com", 8756456787L);
	}
}
