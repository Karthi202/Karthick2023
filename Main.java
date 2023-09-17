package dailypractice;

class Vehicle{
	  String make;
	  String model;
	  int year;
          public Vehicle ( String make,String model, int year) {
        	  this.make=make;
        	  this.model=model;
        	  this.year=year;
          }
    	   void displayinfo() {
    		   System.out.println(make + "  " + model + "  " + year);
       }}

public class Main {

	public static void main(String[] args) {
		Vehicle ve = new Vehicle("AUDI","a4",2023);
		ve.displayinfo();
	}
}

