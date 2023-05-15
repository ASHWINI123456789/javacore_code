package ashwini.com;

public class continue3 {

	public static void main(String[] args) {
		l1:for(int i=1;i<=5;i++){
			l2:for(int j=1;j<=5;j++) {
				if(i%j==1) {
				continue l1;
				}
			System.out.println("hi");
		}

		}
	}
}





