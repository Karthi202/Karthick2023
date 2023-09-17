package dailypractice;

class Studentss{
	private String name;
	private int rollno;
	private int marks=95; 
	
		public String getname() {
			return name;
		}
		public void setname(String name) {
			this.name=name;			
		}
		public int getrollno() {
			return rollno;}
		public void setrollno(int rollno) {
			this.rollno=rollno;
		}	
		void display() {
			System.out.println(name +  " "  +  rollno + " " + marks);
		}
}
	public class Student {
	public static void main(String[] args) {
		Studentss stu = new Studentss();
		stu.setname("Karthick");
		stu.setrollno(61);
		stu.display();		
	}
	}


