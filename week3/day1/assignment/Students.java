package week3.day1.assignment;

public class Students {
	public static void main(String[] args) {
		Students s1=new Students();
		s1.getStudentInfo(25);
		s1.getStudentInfo(25, "Veena");
		s1.getStudentInfo("veena123@gmail.com", "1234567890");
	}

	public void getStudentInfo(int id) {
		System.out.println("Student ID : " +id);
	}
	public void getStudentInfo(int id , String name) {
		System.out.println("Name of student : " +name);
	}
	public void getStudentInfo(String email , String phone) {
		System.out.println("Email ID : "  +email);
		System.out.println("Phone number : " +phone);
	}
	
	
}
