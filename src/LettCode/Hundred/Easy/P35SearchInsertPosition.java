package LettCode.Hundred.Easy;

public class P35SearchInsertPosition {
	static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length, mid = 0;
        while (left < right) {
        	mid = (left+right)/2;
        	if (nums[mid] >= target) {
        		right--;
        	}
        	else left++;
        }
        return right;
    }
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 6};
		int target = 0;
		System.out.println(searchInsert(nums, target));
	}
}
