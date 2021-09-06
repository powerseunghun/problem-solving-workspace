package SWExpertAcademy.D3.TenThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Half11856 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		String tmp = null;
		Set<Character> set = new HashSet<>();
		int[] cnt = new int[26];
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			set.clear();
			Arrays.fill(cnt, 0);
			tmp = br.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				set.add(tmp.charAt(j));
				cnt[tmp.charAt(j)-65]++;
			}
			if (set.size() == 2) {
				flag = true;
				for (int k = 0; k < cnt.length; k++) {
					if (cnt[k] != 0 && cnt[k] != 2) flag = false; 
				}
				if (flag) sb.append("#" + i + " Yes\n");
				else sb.append("#" + i + " No\n");
			}
			else sb.append("#" + i + " No\n");
		}
		System.out.print(sb.toString());
	}
}
