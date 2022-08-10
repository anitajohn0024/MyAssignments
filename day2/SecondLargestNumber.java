package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {
int[] numbers = {22,67,98,1,34,58,99};

public void secondLargestNum() {
	Arrays.sort(numbers); //1,22,34,58,67,98,99
	int length = numbers.length;
	for(int num=length; num<=length; num++) {
		System.out.println("The second largest number is : "+numbers[num-2]);
	}

}
public static void main(String[] args) {
	SecondLargestNumber secondLargestNum = new SecondLargestNumber();
	secondLargestNum.secondLargestNum();
}
}
