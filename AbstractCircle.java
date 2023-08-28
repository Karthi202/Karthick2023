package dailypractice;

abstract class Shape{
	 abstract double  calculateArea(); 
	  
	}
	    class Circle extends Shape{
		  
		  private double radius;
		  private double pi;
	 public Circle( double radius,double pi) {
		 this.radius=radius;
		 this.pi=pi;
		  
		}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return pi * radius * radius;
	}
	     
	    }
public class AbstractCircle {
		 
	public static void main(String[] args) {
		   
		  Circle c = new Circle(5.0, 3.14);
		  System.out.println( c.calculateArea());;
	}
 
}