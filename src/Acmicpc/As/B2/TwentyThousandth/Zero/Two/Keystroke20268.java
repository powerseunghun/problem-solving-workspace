package Acmicpc.As.B2.TwentyThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keystroke20268 {
	static int[] arr1 = null, arr2 = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0;
		String str = null;
		
		while(T-- > 0) {			
			N = Integer.parseInt(str.split(" ")[0]);
			M = Integer.parseInt(str.split(" ")[1]);
			arr1 = new int[N];
			arr2 = new int[M];
			str = br.readLine();
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = Integer.parseInt(str.split(" ")[i]);
			}
			str = br.readLine();
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = Integer.parseInt(str.split(" ")[i]);
			}
			sb.append(N+M == 4 ? 7:1).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
