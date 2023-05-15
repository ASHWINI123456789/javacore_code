//How many times "Hello" is printed?//
package ashwini.com;
import java.util.Scanner;

public class Dowhileloop {
	private static void printHello(int number) {
	
	int count =0;
	do {
		System.out.println("hello");
		count++;
	}while(count<=5);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter string");
		int n= Integer.parseInt(scan.nextLine());
		      printHello(n);
			
		}

	}


