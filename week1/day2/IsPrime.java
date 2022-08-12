package week1.day2;

//import java.util.Iterator;

public class IsPrime {
public static void main(String[] args) {
	int N=13;
	boolean flag=true;
	
		for (int i = 2; i < N; i++) {
			int rem=N%i;
			if (rem==0) {
				flag=false;	
			}
		}
		if(flag)
		{
				System.out.println("Prime Number");
		}
		else
		{
				System.out.println("Not a Prime Number");
		}
				
			}
			
	}


