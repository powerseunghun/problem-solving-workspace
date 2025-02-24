package Acmicpc.As.B2.TenThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ACMContestGrading11531 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null, res = null;
		int t = 0, penalty = 0, solved = 0;
		char p = ' ';
		Map<Character, Integer> map = new HashMap<>();
		while(true) {
			str = br.readLine();
			t = Integer.parseInt(str.split(" ")[0]);
			if (t == -1) break;
			p = str.split(" ")[1].charAt(0);
			res = str.split(" ")[2];
			if (res.equals("right")) {
				solved++;
				penalty += t + map.getOrDefault(p, 0) * 20;
			} else {
				map.put(p, map.getOrDefault(p, 0)+1);
			}
		}
		
		System.out.println(solved + " " + penalty);
		br.close();
	}
}
