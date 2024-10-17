package Acmicpc.As.B4.ThirtyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnionExperiment32369 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int A = Integer.parseInt(str.split(" ")[1]);
		int B = Integer.parseInt(str.split(" ")[2]);
		int res1 = 1, res2 = 1;
		
		while(N-- > 0) {
			res1 += A;
			res2 += B;
			if (res2 > res1) {
				int tmp = res1;
				res1 = res2;
				res2 = tmp;
			} else if (res1 == res2) {
				res2--;
			}
		}
		
		System.out.println(res1 + " " + res2);
		br.close();
	}
}
