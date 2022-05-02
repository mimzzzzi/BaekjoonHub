import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);	

		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		
		int result=0;
		
		if(d1 == d2 && d2 == d3 ) {
			result = 10000+(d1*1000);
		}else if(d1 == d2) {
			result = 1000 + (d1*100);
		}else if(d2 == d3) {
			result = 1000 + (d2*100);
		}else if(d1 == d3){
			result = 1000 + (d1*100);
		}else {
			result=Math.max(d3, Math.max(d1, d2))*100;
		}
		
		System.out.println(result);
	}
}