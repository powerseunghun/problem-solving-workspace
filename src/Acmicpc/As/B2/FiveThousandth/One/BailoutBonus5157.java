package Acmicpc.As.B2.FiveThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BailoutBonus5157 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()), B = 0, n = 0, r = 0, res = 0;
		String str = null;
		
		for (int i = 1; i <= K; i++) {
			str = br.readLine();
			B = Integer.parseInt(str.split(" ")[1]);
			n = Integer.parseInt(str.split(" ")[2]);
			r = Integer.parseInt(str.split(" ")[3]);
			Set<Integer> set = new HashSet<>();
			
			str = br.readLine();
			if (str.length() != 0) {
				for (int j = 0; j < str.split(" ").length; j++) {
					set.add(Integer.parseInt(str.split(" ")[j]));
				}
			}
			res = 0;
			
			while(n-- > 0) {
				str = br.readLine();
				int a = Integer.parseInt(str.split(" ")[0]);
				int b = Integer.parseInt(str.split(" ")[1]);
				if (!set.contains(a)) continue;
				res += b*r / 100;
			}
			
			sb.append("Data Set ").append(i).append(":\n").append(res).append("\n\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
