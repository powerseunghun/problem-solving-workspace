package LettCode.Hundred.Medium;

public class P75SortColors {
    static void sortColors(int[] nums) {
        int[] counts = new int[3];
        int[] B = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
        	counts[nums[i]]++;
        }
        for (int i = 1; i < counts.length; i++) {
        	counts[i] += counts[i-1];
        }
        
        for (int i = nums.length-1; i >= 0; i--) {
        	B[counts[nums[i]]-1] = nums[i];
        	counts[nums[i]]--;
        }
        // nums = B.clone();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = B[i];
        }
    }
	public static void main(String[] args) {
		int[] nums = {2,0,1};
		sortColors(nums);
	}
}
