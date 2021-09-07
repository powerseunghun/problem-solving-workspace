package SWExpertAcademy.D3.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LonelyNumber10912 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		int[] cnt = new int[26];
		Set<Character> set = new HashSet<>();
		ArrayList<Character> list = new ArrayList<>();
		
		for (int i = 1; i <= T; i++) {
			Arrays.fill(cnt, 0);
			list.clear();
			set.clear();
			tmp = br.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				cnt[tmp.charAt(j)-97]++;
				set.add(tmp.charAt(j));
			}
			Iterator iter = set.iterator();
			while (iter.hasNext()) {
				char c = (char)iter.next();
				if (cnt[c-97] != 0 && cnt[c-97] % 2 != 0) {
					list.add(c);
				}
			}
			if (list.size() == 0) {
				sb.append("#" + i + " Good\n");
				continue;
			}
			Collections.sort(list);
			sb.append("#" + i + " ");
			for (int j = 0; j < list.size(); j++) {
				sb.append(list.get(j));
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
