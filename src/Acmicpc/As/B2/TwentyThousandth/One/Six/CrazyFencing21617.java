package Acmicpc.As.B2.TwentyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrazyFencing21617 {
	static int[] h = null, w = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int N = Integer.parseInt(br.readLine());
		double res = 0;
		h = new int[N+1];
		w = new int[N];
		
		str = br.readLine();
		for (int i = 0; i < h.length; i++) {
			h[i] = Integer.parseInt(str.split(" ")[i]);
		}
		str = br.readLine();
		for (int i = 0; i < w.length; i++) {
			w[i] = Integer.parseInt(str.split(" ")[i]);
		}
		
		for (int i = 0; i < N; i++) {
			res += (h[i]+h[i+1]) * w[i] / 2.0;
		}
		
		System.out.println(String.format("%.7f", res));
		br.close();
	}
}
