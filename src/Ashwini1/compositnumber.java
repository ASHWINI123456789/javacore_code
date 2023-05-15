package Ashwini1;
import java.util.Scanner; 

public class compositnumber {

		private static void compositenumber(int n) {
		for (int i=4;i<=n;i++);{
			int count = 0;
			int j= 2;
			int i;
			do {
				int i;
				if(i%j==0) {
				System.out.println(i);
				break;
				}
				j++;
				
				}while(j<=i/2);
		}
			
		public static void main(String[] args) {
			Scanner scan =new Scanner (System.in);
			System.out.println("please enter number");
			int n =Integer.parseInt(System.nextLine());
			 compositenumber(n);
		}
		}
			
		