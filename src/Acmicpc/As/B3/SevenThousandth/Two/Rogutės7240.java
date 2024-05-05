package Acmicpc.As.B3.SevenThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rogutės7240 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int S = Integer.parseInt(str.split(" ")[1]), res = 0;
		
		while(N-- > 0) {
			res = res > S ? res-1 : res;
			res += Integer.parseInt(br.readLine());
		}
		
		System.out.println(res);
		br.close();
	}
}
