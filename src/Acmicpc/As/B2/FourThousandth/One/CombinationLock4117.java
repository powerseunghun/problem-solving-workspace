package Acmicpc.As.B2.FourThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationLock4117 {
	static int func(int N, int T1, int T2, int T3) {
		int res = 4*N-1;
		res += T2-T1+(T1>T2 ? N:0);
		res += T2-T3+(T2<T3 ? N:0);
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = 0, T1 = 0, T2 = 0, T3 = 0;
		String str = null;
		
		while(true) {
			str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			T1 = Integer.parseInt(str.split(" ")[1]);
			T2 = Integer.parseInt(str.split(" ")[2]);
			T3 = Integer.parseInt(str.split(" ")[3]);
			if (N == 0 && T1 == 0 && T2 == 0 && T3 == 0) break;
			sb.append(func(N, T1, T2, T3)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
