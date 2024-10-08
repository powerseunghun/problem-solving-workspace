package Acmicpc.As.B3.TwentyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrexitingAndBrentering25246 {
	static char[] cs = {'a', 'e', 'i', 'o', 'u'};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int idx = -1;
		for (char c : cs) {
			idx = Math.max(idx, str.lastIndexOf(c));
		}
		
		str = idx == -1 ? str : str.substring(0, idx+1) + "ntry";
		System.out.println(str);
		br.close();
	}
}
