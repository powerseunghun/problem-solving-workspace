package Acmicpc.As.S5.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LoadShom1817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), b = 0, w = 0, res = 0;
		StringTokenizer st = null;
		
		if (N != 0) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				w = Integer.parseInt(st.nextToken());
				if (w + b > M) {
					b = w;
					res++;
				}
				else {
					b += w;
				}
			}
		}
		
		System.out.println(b != 0 ? res+1 : res);
		br.close();
	}
}
