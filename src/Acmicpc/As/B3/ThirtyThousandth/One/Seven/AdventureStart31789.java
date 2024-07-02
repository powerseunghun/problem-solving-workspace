package Acmicpc.As.B3.ThirtyThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdventureStart31789 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int X = Integer.parseInt(str.split(" ")[0]);
		int S = Integer.parseInt(str.split(" ")[1]), c = 0, p = 0;
		boolean flag = false;
		
		while(N-- > 0 && !flag) {
			str = br.readLine();
			c = Integer.parseInt(str.split(" ")[0]);
			p = Integer.parseInt(str.split(" ")[1]);
			if (c <= X && p > S) {
				flag = true;
			}
		}
		
		System.out.println(flag ? "YES" : "NO");
		br.close();
	}
}
