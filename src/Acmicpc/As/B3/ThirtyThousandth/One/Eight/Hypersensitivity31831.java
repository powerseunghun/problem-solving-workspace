package Acmicpc.As.B3.ThirtyThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hypersensitivity31831 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine().split(" ")[1]), cur = 0, res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			cur += Integer.parseInt(st.nextToken());
			cur = Math.max(cur, 0);
			res = cur >= M ? res+1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
