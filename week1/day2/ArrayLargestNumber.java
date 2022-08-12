package week1.day2;

import java.util.Arrays;

public class ArrayLargestNumber {
	public static void main(String[] args) {
	
	int[] numbers= {22,67,98,1,34,58,99};
	int length=numbers.length;
	
	Arrays.sort(numbers);
	
	System.out.println("Second Largest number of Array is : " +numbers[length-2]);
	
	}
}
