package week1.day2;

public class Car {	
	public void brandOfCar() {
		System.out.println("Car Brand is TATA");
	}
public String getCarColor() {
	return "Red";
}
public String getcarenginenumber() {
	return "9282";
	
}
public void operations(int a, int b) {
	int sub=a-b;
	System.out.println("Subraction :" +sub);
    int multiply=a*b;
    System.out.println("Multiply:" +multiply);
	int div=a/b;  
	System.out.println("Division:" +div);
	
}
public static void main(String[] args) {
	Car c=new Car();
	c.brandOfCar();
	String carColor = c.getCarColor();
	System.out.println("Car color is " +carColor);
	String getcarenginenumber = c.getcarenginenumber();
	System.out.println("Car engine number is " +getcarenginenumber);
	c.operations(20, 10);
	
}
}
