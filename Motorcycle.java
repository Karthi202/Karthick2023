package dailypractice;

  public class Motorcycle extends Vehicle{
	        int Prize;

			public Motorcycle(String make, String model, int year,int Prize) {
				super(make, model, year);
				this.Prize=Prize;
			}
			void displayinfo2() {
				 System.out.println(make + "  " + model + "  " + year + "  " + Prize);

	}
			public static void main(String[] args) {
				 
		        Motorcycle mc = new Motorcycle("Pulsar","n160",2022,150000);
		        mc.displayinfo2();
			}

		}



