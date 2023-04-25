package week1.day1;

public class Bike {
	private void applybreak() {
		System.out.println("break is applied");
	}
		public static void main(String[]args) {
			Car cr = new Car();
			Bike bk = new Bike();
			
			cr .applybreak();
			cr .soundhorn();
			bk .applybreak();
			
	}

}
