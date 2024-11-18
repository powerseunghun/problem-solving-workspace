package Acmicpc.As.B5.ThirtyThousandth.Two.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CallForProblems32498 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), v = 0, res = 0;
		
		while(n-- > 0) {
			v = Integer.parseInt(br.readLine());
			res = v % 2 != 0 ? res+1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
