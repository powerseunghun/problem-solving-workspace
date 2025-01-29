package Acmicpc.As.B2.TenThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheBucketList16770 {
	static int[] s = null, t = null, b = null, res = null;;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE;
		String str = null;
		s = new int[N]; t = new int[N]; b = new int[N]; res = new int[1001];
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			s[i] = Integer.parseInt(str.split(" ")[0]);
			t[i] = Integer.parseInt(str.split(" ")[1]);
			b[i] = Integer.parseInt(str.split(" ")[2]);
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = s[i]; j < t[i]; j++) {
				res[j] += b[i];
				max = Math.max(res[j], max);
			}
		}
		
		System.out.println(max);
		br.close();
	}
}
