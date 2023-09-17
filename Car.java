package dailypractice;

public class Car extends Vehicle{
        String colour;

		public Car(String make, String model, int year,String colour) {
			super(make, model, year);
			this.colour=colour;
		}
		void displayinfo1() {
			 System.out.println(make + "  " + model + "  " + year + "  " + colour);
		}
					
	public static void main(String[] args) {
		Car car = new Car("AUDI","a4",2023,"Black");
	    car.displayinfo1();
        
	}

}
