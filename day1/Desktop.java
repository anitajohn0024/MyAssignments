package week3.day1;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("24 Inches Monitor");
	}
	public static void main(String[] args) {
		Desktop dp = new Desktop();
		dp.computerModel();
		dp.desktopSize();
	}

}
