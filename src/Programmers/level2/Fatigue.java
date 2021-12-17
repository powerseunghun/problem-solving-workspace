package Programmers.level2;

public class Fatigue {
	static int[][] arr = null;
	static boolean[] check = null;
	static int answer = 0;
	static void dfs(int n, int d, int k, int[][] dungeons) {
		if (d >= n) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (k >= arr[i][0]) {
					count++;
					k -= arr[i][1];
				}
			}
			answer = Math.max(answer, count);
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[d][0] = dungeons[i][0];
				arr[d][1] = dungeons[i][1];
				dfs(n, d+1, k, dungeons);
				check[i] = false;
			}
		}
	}
	static int solution(int k, int[][] dungeons) {
        arr = new int[dungeons.length][2];
        check = new boolean[dungeons.length];
        dfs(dungeons.length, 0, k, dungeons);
        
        return answer;
    }
	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		System.out.println(solution(k, dungeons));
	}
}
