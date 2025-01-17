package Acmicpc.As.B2.TenThousandth.One.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMeIn11319 {
	static List<Character> vList = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int S = Integer.parseInt(br.readLine()), vc = 0;
		String str = null;
		
		while(S-- > 0) {
			vc = 0;
			str = br.readLine().replaceAll(" ", "").toLowerCase();
			for (int i = 0; i < str.length(); i++) {
				if (vList.contains(str.charAt(i))) vc++;
			}
			sb.append(str.length()-vc + " " + vc).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
