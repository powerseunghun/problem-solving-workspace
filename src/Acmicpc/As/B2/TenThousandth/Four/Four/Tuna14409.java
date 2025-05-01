package Acmicpc.As.B2.TenThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tuna14409 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int X = Integer.parseInt(br.readLine());
		int P1 = 0, P2 = 0, res = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			P1 = Integer.parseInt(str.split(" ")[0]);
			P2 = Integer.parseInt(str.split(" ")[1]);
			res += Math.abs(P1-P2) <= X ? Math.max(P1, P2) : Integer.parseInt(br.readLine());
		}
		
		System.out.println(res);
		br.close();
	}
}
