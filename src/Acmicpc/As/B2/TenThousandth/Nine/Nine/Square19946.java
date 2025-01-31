package Acmicpc.As.B2.TenThousandth.Nine.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Square19946 {
	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		int res = 64;
		
		while((N & 1) == 0) {
			N >>= 1;
			res--;
		}
		
		System.out.println(res);
		br.close();
	}
}
// 2 3 6 12 24 