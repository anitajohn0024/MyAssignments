package week1.day2;

public class MyCalculator {
public static void main(String[] args) {
	Calculator calc = new Calculator();
	System.out.println(calc.add(1, 2, 3));
	System.out.println(calc.sub(3, 2));
	System.out.println(calc.mul(3.333333333,5.55555555555));
	System.out.println(calc.divide(6.0F,2.0F));
}
}
