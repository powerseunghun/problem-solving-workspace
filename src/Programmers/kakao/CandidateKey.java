package Programmers.kakao;

import java.util.HashMap;
import java.util.Map;

public class CandidateKey {
	static int count = 0;
	static boolean[] check = null;
	static void dfs(int n, int d, int idx, String[][] relation, String str) {
		if (d >= n) return;
		if (!str.equals("")) {
			String[] sp = str.split(" ");
			
			for (int i = 0; i < sp.length; i++) {
				if (check[Integer.parseInt(sp[i])]) return;
			}
			
			Map<String, Integer> map = new HashMap<>();
			boolean flag = true;
			for (int i = 0; i < relation.length; i++) {
				String s = "";
				for (int j = 0; j < sp.length; j++) {
					s += relation[i][Integer.parseInt(sp[j])];
				}
				if (map.containsKey(s)) {
					flag = false;
					break;
				}
				map.put(s, 1);
			}
			
			if (flag) {
				count++;
				for (int i = 0; i < sp.length; i++) {
					check[Integer.parseInt(sp[i])] = true;
				}
			}
		}
		for (int i = idx; i < n; i++) {
			dfs(n, d+1, i+1, relation, str + (i+" "));
		}
	}
	static int solution(String[][] relation) {
		check = new boolean[relation[0].length];
        dfs(relation[0].length, 0, 0, relation, "");
        int answer = count;
        
        return answer;
    }
	public static void main(String[] args) {
		String[][] relation = {
				{"100", "ryan", "music", "2"},
				{"200", "apeach", "math", "2"},
				{"300", "tube", "computer", "3"},
				{"400", "con", "computer", "4"},
				{"500", "muzi", "music", "3"},
				{"600", "apeach", "music", "2"}
		};
		System.out.println(solution(relation));
	}
}
