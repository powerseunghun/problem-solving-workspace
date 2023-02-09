package Acmicpc.As.B2.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Candy2909 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int C = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]);
		int z = (int)Math.pow(10, K), tc = C/z*z;
		
		// 반올
		System.out.println(C%z >= z/2 ? (z==1 ? 0 : z)+tc : tc);
		br.close();
	}
}
