package Programmers.kakao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BadUser {
	static String[] arr = null;
	static boolean[] check = null;
	static Set<String> set = new HashSet<>();
	static int count = 0;
	static void dfs(int n, int d, String[] user_id, String[] banned_id) {
		if (d >= n) {
			for (int i = 0; i < banned_id.length; i++) {
				if (banned_id[i].length() != arr[i].length()) return;
				for (int j = 0; j < banned_id[i].length(); j++) {
					if (banned_id[i].charAt(j) == '*') continue;
					if (banned_id[i].charAt(j) != arr[i].charAt(j)) return;
				}
			}
			String[] tmp = arr.clone();
			StringBuilder sb = new StringBuilder();
			Arrays.sort(tmp);
			for (String s : tmp) {
				sb.append(s);
			}
			set.add(sb.toString());
			return;
		}
		
		for (int i = 0; i < user_id.length; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[d] = user_id[i];
				dfs(n, d+1, user_id, banned_id);
				check[i] = false;
			}
		}
	}
	static int solution(String[] user_id, String[] banned_id) {
        arr = new String[banned_id.length];
        check = new boolean[user_id.length];
        dfs(banned_id.length, 0, user_id, banned_id);
        
        return set.size();
    }
	public static void main(String[] args) {
		String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
//		String[] banned_id = {"fr*d*", "abc1**"};
		String[] banned_id = {"fr*d*", "*rodo", "******", "******"};
		System.out.println(solution(user_id, banned_id));
	}
}
