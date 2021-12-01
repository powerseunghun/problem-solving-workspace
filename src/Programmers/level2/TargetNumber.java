package Programmers.level2;

public class TargetNumber {
	static int count = 0;
	static void dfs(int n, int d, int[] numbers, int target, int sum) {
		if (d >= n) {
			if (target == sum) count++;
			return;
		}
		
		dfs(n, d+1, numbers, target, sum+numbers[d]);
		dfs(n, d+1, numbers, target, sum-numbers[d]);
	}
	static int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers.length, 0, numbers, target, 0);
        answer = count;
        
        return answer;
    }
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		System.out.println(solution(numbers, target));
	}
}
