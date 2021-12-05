package Programmers.level3;

public class WordTranslation {
	static int count = Integer.MAX_VALUE;
	static boolean[] check = null;
    static int getDiff(String str1, String str2) {
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) count++;
		}
		return count;
	}
	static void dfs(int n, int d, int transCount, String str, String target, String[] words) {
		if (str.equals(target)) {
			count = Math.min(transCount, count);
			return;
		}
		if (d >= n) return;
		
		for (int i = 0; i < words.length; i++) {
			if (getDiff(str, words[i]) == 1 && !check[i]) {
				check[i] = true;
				dfs(n, d+1, transCount+1, words[i], target, words);
				check[i] = false;
			}
		}
	}
	static int solution(String begin, String target, String[] words) {
        int answer = 0, flag = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) flag = 1;
        }
        
        if (flag == 0) return 0;
        
        check = new boolean[words.length];
        
        dfs(words.length, 0, 0, begin, target, words);
        answer = count == Integer.MAX_VALUE ? 0 : count;
        
        return answer;
    }
	public static void main(String[] args) {
		String begin = "hit", target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		
		System.out.println(solution(begin, target, words));
	}
}
