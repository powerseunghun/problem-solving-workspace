package Acmicpc.As.B2.TwentyThousandth.Seven.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Snake27512 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int m = Integer.parseInt(str.split(" ")[1]);
		int r1 = n&1, r2 = m&1;
		
		System.out.println(n*m-(r1!=0 && r2!=0 ? 1 : 0));
		br.close();
	}
}
