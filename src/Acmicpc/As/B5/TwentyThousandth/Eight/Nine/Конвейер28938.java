package Acmicpc.As.B5.TwentyThousandth.Eight.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Конвейер28938 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0;
		
		while(st.hasMoreTokens()) {
			res += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(res == 0 ? "Stay" : res > 0 ? "Right" : "Left");
		br.close();
	}
}
