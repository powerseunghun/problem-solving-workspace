package LettCode.Hundred.Easy;

public class P1TwoSum {
	static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int idx1 = 0, idx2 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    idx1 = i;
                    idx2 = j;
                }
            }
        }
        res[0] = idx1;
        res[1] = idx2;
        return res;
    }
	public static void main(String[] args) {
		int target = 9;
		int[] nums = {2, 7, 11, 15}, res = twoSum(nums, target);
		
		for (int el : res) {
			System.out.print(el + " ");
		}
		System.out.println();
	}
}
