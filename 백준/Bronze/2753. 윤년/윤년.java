import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int  leapyear = sc.nextInt();
		
		if ( leapyear%4 == 0 ) {
			if(leapyear%100!=0 || leapyear%400==0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}else {
			System.out.println("0");
		}
		
	}
}