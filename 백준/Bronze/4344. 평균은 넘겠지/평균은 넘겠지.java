import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] arr ;
		int test = sc.nextInt();
		
		for (int i = 0; i < test; i++) {
			int n = sc.nextInt();
			arr = new int[n];
			
			double sum = 0;
			
			for (int j = 0; j < arr.length; j++) {
				int grade = sc.nextInt();
				arr[j] = grade;
				sum += grade;
			}
			double avg = (sum/n);
			double cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] > avg) {
					cnt ++;
				}
			}
			System.out.printf("%.3f%%\n",(cnt/n)*100);;
		}
	}
}