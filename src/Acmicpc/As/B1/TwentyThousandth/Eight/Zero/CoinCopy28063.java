package Acmicpc.As.B1.TwentyThousandth.Eight.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoinCopy28063 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int x = Integer.parseInt(str.split(" ")[0]);
		int y = Integer.parseInt(str.split(" ")[1]), res = 0;
		
		if (N == 1) {}
		else if ((x == 1 && y == 1) || (x == N && y == 1) || (x == 1 && y == N) || (x == N && y == N)) {
			res = 2;
		}
		else if (x == 1 || y == 1 || x == N || y == N) {
			res = 3;
		}
		else res = 4;
		
		System.out.println(res);
		br.close();
	}
}
