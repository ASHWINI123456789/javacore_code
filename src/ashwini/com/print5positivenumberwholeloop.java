
//write a program to find sum of the 5 positive numbers.If a i/o number is 99 then stop the sum and display it//
package ashwini.com;
import java.util.Scanner;

public class print5positivenumberwholeloop {

	public static void main(String[] args) {
		int sum =0;
		int count =0;
		while(true) {
			System.out.println("please enter number");
			Scanner scan = new Scanner(System.in);
			int n= Integer.parseInt(scan.nextLine());
			if(n<0) {
				continue;
			}
			if(n==99) {
				break;
			}
			sum+=n;
			count++;
			if(count==5) {
				break;
				}
			}
		System.out.println(sum);
		}
}

