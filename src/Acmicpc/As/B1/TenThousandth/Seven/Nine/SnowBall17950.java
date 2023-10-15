package Acmicpc.As.B1.TenThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnowBall17950 {
	static final long mod = 1000000007L;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int H = Integer.parseInt(str.split(" ")[0]);
		int x = Integer.parseInt(str.split(" ")[1]), t = 0;
		long s = 1, res = 0;
		
		while (H-- > 0) {
			t = Integer.parseInt(br.readLine());
			s *= x;
			s %= mod;
			res += t * s;
			res %= mod;
		}
		
		System.out.println(res);
		br.close();
	}
}
