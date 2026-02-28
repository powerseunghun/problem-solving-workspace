package Acmicpc.As.B2.TwentyThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsItEven24927 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int K = Integer.parseInt(str.split(" ")[1]), X = 0;
		
		while(N-- > 0) {
			X = Integer.parseInt(br.readLine());
			while(!((X & 1) != 0)) {
				X >>= 1;
				K--;
			}
		}
		System.out.println(K == 0 ? 1 : 0);
		br.close();
	}
}
