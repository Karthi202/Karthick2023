package dailypractice;

 class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String input= " Vijay Karthick";
			char[] Array = input.toCharArray();
			int left,right=0;
			right=Array.length-1;
	  
	        for ( left=0;left<right;left++,right--) {
 
	        		  char t  = Array[left];
	        		  Array[left]=Array[right];
	        		  Array[right]=t;}	        			
	      for(char a : Array) {
	    	  System.out.print(a);
	      }
	      System.out.println();
	      }
	}


