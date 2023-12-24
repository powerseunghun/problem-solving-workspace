package Acmicpc.As.S5.TenThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 謎紛芥索紀14730 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), C = 0, K = 0, res = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			C = Integer.parseInt(str.split(" ")[0]);
			K = Integer.parseInt(str.split(" ")[1]);
			res += C*K;
		}
		
		System.out.println(res);
		br.close();
	}
}
