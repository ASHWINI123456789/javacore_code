//write a program to check weather a first number is a seed of the second number or not//
package primnumber;
import java.util.Scanner;

public class isprimnumber {
	private static boolean  isprimeNumber(int x,int y ) {
		int sum =x;
		int temp = x;
		while(x>0) {
			int d= x%10;
			sum=sum*d;
			x/=10;
		}
			if(sum == y) {
				return true;
			}
				else {
					return false;
				}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("pleas enter a number x=");
		int x =Integer.parseInt(scan.nextLine());
		System.out.println("please enter a number y=");
		int y =Integer.parseInt(scan.nextLine());
		boolean flag = isprimeNumber(x,y);
		if(flag){
			System.out.println("x is a seed of y");
		}
		else {
			System.out.println("x is not a seed of y");

				
		}
	}
}
		
	
	


