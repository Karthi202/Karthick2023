package dailypractice;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j,k,sp=20;
        for(i=1;i<=5;i++) {
        	for(j=1;j<=sp;j++) {
        		System.out.print(" ");
        	}
        	sp--;
        	for(k=1;k<=i;k++) {
        		System.out.print("* ");
        		
        	}
        	System.out.println();
        }
	      sp=20;
	   for(i=4;i>=1;i--) {
		   for(j=4;j<=sp;j++){
			   System.out.print(" ");
		   }
		   sp++;
		   for(k=1;k<=i;k++) {
			   System.out.print("* ");
		   }
		   System.out.println();
			   
		   }
	   }
	
}

 
 
