package week1.day2;

public class Car {
	public void printCar() {
		System.out.println("The Vehicle Name is Car");
	}
	public String getCarColor(String color) {
		return color;
	}
	public int carEngineNumber(int engineNum) {
		return engineNum;
	}
	public void numberManipulation(int a, int b) {
		int sub=a-b;
		System.out.println("Subtraction :"+sub);
		int add=a+b;
		System.out.println("Addition :"+add);
		int mul=a*b;
		System.out.println("Multiplication :"+mul);
		int div=a/b;
		System.out.println("Division :"+div);
	}
	public static void main(String[] args) {
		Car car = new Car();
		car.printCar();
		String carColor = car.getCarColor("red");
		System.out.println("Car Color :"+carColor);
		int carEngNo = car.carEngineNumber(54321);
		System.out.println("Car Engine Number :"+carEngNo);
		System.out.println("The input given is : a=10, b=20");
		car.numberManipulation(10, 20);
		
	}
}
