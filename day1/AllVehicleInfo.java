package week3.day1;

public class AllVehicleInfo {
	public static void main(String[] args) {
		BMW bmw = new BMW();
		Audi audi = new Audi();
		Bajaj bajaj = new Bajaj();
		
		System.out.println("From BMW Class");
		bmw.applyBrake();
		bmw.noOfSeats();
		bmw.sportyCar();
		System.out.println("------------------------");
		
		System.out.println("From Audi Class");
		audi.applyBrake();
		audi.noOfSeats();
		audi.familyCar();
		System.out.println("------------------------");
		
		System.out.println("From Bajaj Class");
		bajaj.applyBrake();
		bajaj.noOfSeatsinAuto();
		bajaj.typeOfVehicle();
		System.out.println("------------------------");
		
	}
	
	

}
