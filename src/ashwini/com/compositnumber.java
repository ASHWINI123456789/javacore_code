package ashwini.com;
import java.util.Scanner;

public class compositnumber {
 public static void main(String[]args) {
	 int n=10;
	  for(int i=4;i<=n;i++) {
		  int count=0;
		  int j=2;
		  do {
			  if(i%j==0) {
				  System.out.println(i);
				  break;
				  
			  }
			  j++;
		  }while(j<=i/2);
	  }
 
 }
}
		//  System.out.println("the given number is composite");
	  //} else { 
		//	  System.out.println("the given number is not composite");
	  //}
	  //}
		// }

  
	
		