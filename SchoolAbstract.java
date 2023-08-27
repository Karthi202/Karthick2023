package dailypractice;

abstract class School {
	private String Name;
	private String History;
	private String Branch;
	private int Fees;
	
}
     class Teachers extends School{
    	    private String Name;
    		private String History;
    		private String Branch;
    		private int Fees;
    		
    		public String getName() {
    			return Name;
    		}
    		public void setName(String Name) {
    			this.Name=Name;
    		}
    		public String getHistory() {
    			return History;
    		}
    		public void setHistory(String History) {
    			this.History=History;
    		}
    		public String getBranch() {
    			return History;
    		}
    		public void setBranch(String Branch) {
    			this.Branch=Branch;}
    		public int getFees() {
    			return Fees;
    		}
    		public void setFees(int Fees) {
    			this.Fees=Fees;
    		}
    		void display() {
    			System.out.println(Name +" "+ History +" "+ Branch +  " "+ Fees);
    		}}
    	 class Students extends School{
    		 private String Name;
     		private String History;
     		private String Branch;
    	 
    	      public String getName() {
 			  return Name;}
 		      
 		     public void setName(String Name) {
 			  this.Name=Name;}
 		     
 		     public String getHistory() {
 			 return History;}
 		     
 		      public void setHistory(String History) {
 			this.History=History;}
 		
 		     public String getBranch() {
 			  return History;}
 		      
 		     public void setBranch(String Branch) {
 			  this.Branch=Branch;}
 		     
 		    void display1() {
    			System.out.println(Name +" "+ History +" "+ Branch );
    		}
    	 
    	 }

public class SchoolAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Teachers tea = new Teachers();
		 tea.setName("Govt.Hr.Sec.School");
		 tea.setHistory("One of the Famous School");
		 tea.setBranch("Computer Science");
		 tea.setFees(10000);
		 tea.display();
		 
		 Students stud = new Students();
		 stud.setName("Govt.Hr.Sec.School");
		 stud.setHistory("One of the Famous School");
		 stud.setBranch("Computer Science");
		 stud.display1();
		 
	
	}




	}


