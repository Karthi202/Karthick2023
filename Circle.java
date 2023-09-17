package mydailypractice;

public class Circle extends Shapes {
	double radius;
	double pi;
	
	public Circle(double radius,double pi) {
		this.radius=radius;
		this.pi=pi;
	}
      public  double calculatedarea() {
    	  return pi *radius * radius;
      }
	public static void main(String[] args) {
		 Circle c = new Circle(10.0, 3.14);
		 System.out.println(c.calculatedarea());

	}

}
