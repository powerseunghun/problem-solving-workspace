package Programmers.level2;

public class FindPrime {
	static int count = 0;
	static boolean[] check = new boolean[10000000];
	static boolean[] used = null;
	static boolean isPrime(int val) {
		if (val <= 1) return false;
		
		for (int i = 2; i <= Math.sqrt(val); i++) {
			if (val % i == 0) return false;
		}
		return true;
	}
	static void dfs(int d, String numbers, String str) {
		if (d > 0) {
			int val = Integer.parseInt(str);
			if (isPrime(val) && !check[val]) {
				check[val] = true;
				count++;
			}
			if (d >= numbers.length()) return;
		}
		
		for (int i = 0; i < numbers.length(); i++) {
			if (!used[i]) {
				used[i] = true;
				dfs(d+1, numbers, str+numbers.charAt(i));
				used[i] = false;
			}
		}
	}
	static int solution(String numbers) {
		used = new boolean[numbers.length()];
		dfs(0, numbers, "");
		return count;
    }
	public static void main(String[] args) {
		System.out.println(solution("17"));
		return;
	}
}

