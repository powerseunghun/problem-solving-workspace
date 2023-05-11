package Acmicpc.As.B2.TenThousandth.Six.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class HeirsDilemma16412 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		Set<Character> set = new HashSet<>();
		int L = Integer.parseInt(tmp.split(" ")[0]);
		int H = Integer.parseInt(tmp.split(" ")[1]), res = 0;
		boolean flag = true;
		
		for (int i = L; i <= H; i++) {
			tmp = String.valueOf(i);
			set.clear();
			for (int j = 0; j < tmp.length(); j++) {
				set.add(tmp.charAt(j));
			}
			if (set.size() != tmp.length()) continue;
			
			flag = true;
			for (Character c : set) {
				if ((c-'0' == 0) || (i % (c-'0') != 0)) {
					flag = false;
					break;
				}
			}
			res += flag ? 1 : 0;
		}
		
		System.out.println(res);
		br.close();
	}
}
