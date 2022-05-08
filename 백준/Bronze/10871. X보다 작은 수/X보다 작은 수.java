import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		//반복문에서 다시 입력받을것이므로 초기화 (공백으로 나눔?)
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i <N; i++) {
			// 수열 A 담기
			int value = Integer.parseInt(st.nextToken());
			// X와 비교해 sb에 추가하기
			if(value<X) sb.append(value).append(' ');
		}
		System.out.println(sb);
	}
	
}