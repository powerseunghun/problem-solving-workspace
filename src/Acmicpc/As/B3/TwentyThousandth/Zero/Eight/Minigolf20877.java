package Acmicpc.As.B3.TwentyThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Minigolf20877 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0, a = 0, w = 0; i < N; i++) {
			a = Integer.parseInt(st.nextToken());
			a = a > 7 ? 7 : a;
			w = i%2 == 0 ? a-2 : a-3;
			sum += w > 8 ? 7 : w;
		}
		
		System.out.println(sum);
		br.close();
	}
}
