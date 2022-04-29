import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int cook = sc.nextInt();
		int add = m + cook ;
		
		if(add > 60) {
			int H = add/60;
			int M = add%60;
			
			if(h+H >= 24) System.out.println((h+H)-24+" "+M);
			else System.out.println((h+H)+" "+M);
			
		}else if (add == 60) {
			if(h+1 >= 24) System.out.println((h+1-24)+" "+"0");
			else System.out.println(h+1+" "+ "0");

		}else {
			if(h >= 24) System.out.println((h-24)+" "+add);
			else System.out.println(h+" "+add);		
		}
	}
}
