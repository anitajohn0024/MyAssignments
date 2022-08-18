package week1.day1;

public class TwoWheeler {
int noOfWheels = 2;
short noOfMirrors = 2 ;
long chassisNumber = 516L;
boolean isPunctured = false;
String bikeName = "Bajaj Pulsar";
double runningKM = 20000;
public static void main(String[] args) {
	TwoWheeler obj = new TwoWheeler();
	System.out.println("No of Wheels : "+obj.noOfWheels);
	System.out.println("No of Mirrors : "+obj.noOfMirrors);
	System.out.println("Chassis Number : "+obj.chassisNumber);
	System.out.println("Punctured? "+obj.isPunctured);
	System.out.println("Bike Name : "+obj.bikeName);
	System.out.println("Running Kilometer : "+obj.runningKM);
}
}
