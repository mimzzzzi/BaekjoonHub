import java.util.Scanner;

public class Main {
	public static void main(String args[])  {
	
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] sub = new int[size];
		int max = 0;
		for (int i = 0; i < sub.length; i++) {
			sub[i] = sc.nextInt();
			if(sub[i] > max) {
				max = sub[i];
			}
		}
		
		double sum =0;
		for (int i = 0; i < sub.length; i++) {
			sum += (double)sub[i]/max*100;
		}
		double avg = sum/size;
		System.out.println(avg);
	}	
}