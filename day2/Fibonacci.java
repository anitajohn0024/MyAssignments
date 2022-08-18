package week1.day2;

public class Fibonacci {
public static void main(String[] args) {
	int firstnum = 0;
	int secnum = 1;
	for (int i = 0; i < 11; i++) {
		int sum = firstnum + secnum;
		firstnum = secnum;
		secnum =sum;
		System.out.println(sum);
		
	}
}
}
