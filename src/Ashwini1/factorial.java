package Ashwini1;

import java.util.Scanner; 

public class factorial {

	private static void printfact(int n) {
		// TODO Auto-generated method stub
		int fact =1,i=1;
		do {
			fact*=i;
			i++;
		}while(i<=n);
		System.out.println(fact);
	}
	
		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			
			int n = Integer.parseInt(scan.nextLine());
			printfact(n);
		

	}

}
