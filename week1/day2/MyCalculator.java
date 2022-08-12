package week1.day2;

public class MyCalculator {
public static void main(String[] args) {
	Calculator c=new Calculator();
	System.out.println("Sum value : " +c.add(10,20, 30));
	System.out.println("Subtraction Value : " +c.sub(50, 25));
	System.out.println("Multiplication value : " +c.mul(0.5632, 25.652));
	System.out.println("Division Value : " +c.divide(6.20f, 1.5f));
	
}
}
