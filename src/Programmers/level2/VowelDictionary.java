package Programmers.level2;

public class VowelDictionary {
	static char[] vowels = {'A', 'E', 'I', 'O', 'U'};
	static int count = 0, res = 0;
	static void dfs(int n, int d, String word, String str) {
		if (d >= n || str.equals(word)) {
			res = str.equals(word) ? count : res;
			return;
		}
		for (int i = 0; i < vowels.length; i++) {
			count++;
			dfs(n, d+1, word, str+vowels[i]);
		}
	}
	static int solution(String word) {
        dfs(5, 0, word, "");
        return res;
    }
	public static void main(String[] args) {
		String word = "AAAE";
		System.out.println(solution(word));
	}
}
