import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[])  {
	
		Scanner sc = new Scanner(System.in);
		int mul = sc.nextInt()* sc.nextInt()* sc.nextInt();
		String temp = Integer.toString(mul);
		int[] digit = new int[temp.length()];
		int[] cnt = new int [10];
		
        //mul -> digit[]
		for (int i = 0; i < digit.length; i++) {
			digit[i] += temp.charAt(i)-'0';
			
		}
        //digit -> cnt
		for (int i = 0; i < digit.length; i++) {
			switch (digit[i]) {
			case 0: cnt[0] += 1; break;
			case 1: cnt[1] += 1; break;
			case 2: cnt[2] += 1; break;
			case 3: cnt[3] += 1; break;
			case 4: cnt[4] += 1; break;
			case 5: cnt[5] += 1;break;
			case 6: cnt[6] += 1;break;
			case 7: cnt[7] += 1;break;
			case 8: cnt[8] += 1;break;
			case 9: cnt[9] += 1;break;
			default:break;
			}
		}
        //cnt print
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}	
}