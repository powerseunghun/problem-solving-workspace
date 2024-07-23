package Acmicpc.As.B3.TwentyThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OddEvenArray25629 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0, odd = 0, even = 0;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			if ((v&1) == 1) odd++;
			else even++;
		}
		
		System.out.println((odd-even == 0 || odd-even == 1) ? "1" : "0");
		br.close();
	}
}
