package mydailypractice;

public class Triangle extends Shapes {
	double height;
	double breath;
	
	public Triangle (double height,double breath) {
		this.height=height;
		this.breath=breath;
	}
	public double calculatedarea() {
		return 0.5 * height * breath;
	}
	public static void main(String[] args) {
	     Triangle t = new Triangle(5.0, 3.0);
	     System.out.println(t.calculatedarea());

	}

}
