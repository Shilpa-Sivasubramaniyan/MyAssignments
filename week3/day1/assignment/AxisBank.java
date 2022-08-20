package week3.day1.assignment;

public class AxisBank extends BankInfo {
public static void main(String[] args) {
	AxisBank ab=new AxisBank();
	ab.savings();
	ab.fixed();
	ab.myDeposit();
	
}
	public void deposit() {
		int deposit =60000;
		System.out.println("Deposit Amount : " +deposit);
	}
	
		public void myDeposit() {
			System.out.print("AxisBank Class " );
			this.deposit();
			System.out.print("BankInfo Class ");
			super.deposit();
			}
}