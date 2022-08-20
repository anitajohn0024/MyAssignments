package week3.day1;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("Recurring Deposit Overridden in Axis Bank");
}
public static void main(String[] args) {
	AxisBank axis = new AxisBank();
	axis.deposit();
}
}
