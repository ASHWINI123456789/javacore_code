//what should be the values for num1 and num2 to product to the output as 4//

package produce;
import java.util.Scanner;

public class sumofnumber {
	private static void printproduct(int num1,int num2) {
   
	while(num1>=2) {
		if(num1>num2) {
			num1=num1/2;
				
		}
		else {
			
			System.out.println(num1);
		break;
		}
	}
	}
		
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter num1");
	int num1 = Integer.parseInt(scan.nextLine());
	System.out.println("enter num2");
	int num2 = Integer.parseInt(scan.nextLine());
	      printproduct(num1,num2);
}
	
}

	

	
	
		