package week3.day1.assignment;

public class Desktop extends Computer{

	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();
	}
	public void desktopSize() {
		int size= 20;
		System.out.println("Size of Desktop in inches : " +size);
	}
}
