package ashwini.com;

public class breakcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
		
		for(int j=5;j>=2;j--) {
			if(i*j>12) {
		continue;
		}
		System.out.println("Hi");
		}
		System.out.println("Hello");

	}

}
}
