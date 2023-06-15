package Acmicpc.As.B2.TenThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Fitness15180 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int S = Integer.parseInt(br.readLine()), v = 0;
		boolean flag = true;
		Set<Integer> set = new HashSet<>();
		String str = null;
		char dir = ' ';
		
		sb.append(S).append(" ");
		set.add(S);
		while(true) {
			str = br.readLine();
			if (str.equals("#")) break;
			dir = str.charAt(0);
			v = (str.charAt(1) - '0') * (dir == 'A' ? -1 : 1);
			S += v;
			S = S <= 0 ? S += 8 : S > 8 ? S -= 8 : S;
			if (set.contains(S)) {
				flag = false;
			}
			set.add(S);
			sb.append(S).append(" ");
		}
		
		System.out.println(sb.append(!flag || set.size() < 5 ? "reject" : "").toString());
		br.close();
	}
}
