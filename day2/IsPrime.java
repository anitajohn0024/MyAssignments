package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n = 10;
		int j = 2, count = 0;
		for (int i = 2; i <= n; i++) { 
			count = 0;
			for (j = 2; j < i; j++) { 
				if (i % j == 0) {
					count=count+1;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i+ " - The number is prime");
			} else {
				System.out.println(i+ " - The number is not prime");
			}
		}
	}
}