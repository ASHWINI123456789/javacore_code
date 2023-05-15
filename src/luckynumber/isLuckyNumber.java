//
package luckynumber;

import java.util.Scanner;

public class isLuckyNumber {
	private static boolean LuckyNumber(int number) {
	
	int sum =0;
	String str = String.valueOf(number);
		int length = str.length();
		if(length ==1) {
			return false;
			}
		while (number>0) {
			String str1 =String.valueOf(number);
			int length1 = str.length();
			int d = number%10;
			if(length%2==0) {
			sum = sum+d*d;
		}
		number = number/10;
			
		}
	if(sum%9==0) {
		return true;
		
	}
	else {
		return false;
	}
	}

	       public static void main(String[]args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter a number");
			int x= Integer.parseInt(scan.nextLine());
			if(LuckyNumber(x)) {
				System.out.println(x+"is a luckynumber ");
			}else {
				System.out.println(x+"is not a luckynumber");
						
				
			}
		}
}

			
			
		
			
	
				
		


