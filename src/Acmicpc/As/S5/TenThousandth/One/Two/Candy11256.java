package Acmicpc.As.S5.TenThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Candy11256 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int T = Integer.parseInt(br.readLine()), J = 0, N = 0, R = 0, C = 0, res = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			J = Integer.parseInt(str.split(" ")[0]);
			N = Integer.parseInt(str.split(" ")[1]);
			
			res = 0;
			arr = new int[N];
			for (int i = 0; i < N; i++) {
				str = br.readLine();
				R = Integer.parseInt(str.split(" ")[0]);
				C = Integer.parseInt(str.split(" ")[1]);
				arr[i] = R*C;
			}
			Arrays.sort(arr);
			
			for (int i = arr.length-1; i >= 0; i--) {
				if (J <= 0) break;
				J -= arr[i];
				res++;
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
