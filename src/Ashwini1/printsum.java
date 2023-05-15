package Ashwini1;

import java.util.Scanner;

public class printsum {

	
		private static void printsum(int number1) { 
			int sum =0;
			int number3 = 0;
			do {
				System.out.println("please enter a number");
				Scanner scan = new Scanner(System.in);
				int number =Integer.parseInt(scan.nextLine());
				sum+=number;
			}while(number3!=0);
			System.out.println(sum);
			
			}
		
			
				
			
	}


