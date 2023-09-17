package mydailypractice;

public class Rectangle extends Shapes {
	double length;
	double breath;
	
	public Rectangle(double length,	double breath) {
               this.length=length;
	           this.breath=breath;}
	public double calculatedarea() {
		return length * breath;
	}
	

	public static void main(String[] args) {
		 
           Rectangle r = new Rectangle(10, 15 );
           System.out.println(r.calculatedarea());
	}

}
