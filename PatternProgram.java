package dailypractice;

public class PatternProgram {

	public static void main(String[] args) {
		int i,j,k,rows=3;
		for(i=1;i<=3;i++) {
			for(j=rows;j>i;j--)
			{
				System.out.print(" ");
			}
			  int Temp = 1;
			  for(k=1;k<=i;k++) {
				  System.out.print(Temp + " ");
				  Temp = Temp * (i-k)/(k);
			  }
			  System.out.println();
			  }
			  
		  }

	}


