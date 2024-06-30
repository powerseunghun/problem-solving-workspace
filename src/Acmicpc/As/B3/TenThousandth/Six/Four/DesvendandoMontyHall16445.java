package Acmicpc.As.B3.TenThousandth.Six.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DesvendandoMontyHall16445 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v = 0, res = 0;
		
		while(N-- > 0) {
			v = Integer.parseInt(br.readLine());
			res = v > 1 ? res+1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
