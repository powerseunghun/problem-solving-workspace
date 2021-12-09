package Programmers.level1;

public class MakePrime {
	static int[] arr = new int[3001];
	static int count = 0;
	static void arrInit() {
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) continue;
			for (int j = 2*i; j < arr.length; j+=i) {
				arr[j] = 0;
			}
		}
	}
	static void dfs(int d, int sum, int[] nums, int idx) {
		if (d >= 3) {
			if (arr[sum] != 0) count++;
			return;
		}
		
		for (int i = idx; i < nums.length; i++) {
			dfs(d+1, sum+nums[i], nums, i+1);
		}
	}
	static int solution(int[] nums) {
        int answer = -1;
        arrInit();
        dfs(0, 0, nums, 0);
        answer = count;
        
        return answer;
    }
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		System.out.println(solution(nums));
	}
}
