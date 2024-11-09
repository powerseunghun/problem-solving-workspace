package Acmicpc.As.B4.ThirtyThousandth.Two.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JumbledScoreboards32604 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0, ca = -1, cb = -1;
		boolean flag = true;
		String str = null;
		
		while(N-- > 0 && flag) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			
			if (ca > a || cb > b) flag = false;
			ca = a;
			cb = b;
		}
		
		System.out.println(flag ? "yes" : "no");
		br.close();
	}
}
