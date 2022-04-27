import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
	
		int a = B/100;
		int b = B/10 - (a*10);
		int c = B%(100*a+10*b);
		
		System.out.println(A * c);
		System.out.println(A * b);
		System.out.println(A * a);
		System.out.println(A * B);
		
	}
}