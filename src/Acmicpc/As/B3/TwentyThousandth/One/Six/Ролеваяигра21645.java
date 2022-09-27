package Acmicpc.As.B3.TwentyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ролеваяигра21645 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int k = Integer.parseInt(tmp.split(" ")[2]);
		long res = 0;
		// 1 = 1 0
		// 2 = 0 1
		// 3 = 1 1
		// 4 = 0 2
		
		res = m < k ? n*m : n*((k-1)+m/k);
		System.out.println(res);
		br.close();
	}
}
