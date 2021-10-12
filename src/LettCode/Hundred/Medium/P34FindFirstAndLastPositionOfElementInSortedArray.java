package LettCode.Hundred.Medium;

public class P34FindFirstAndLastPositionOfElementInSortedArray {
	static boolean flag = false;
	static int upperBound(int[] nums, int target) {
		int mid = 0, l = 0, r = nums.length-1;
		while (l <= r) {
			mid = (l+r) / 2;
			if (nums[mid] > target) {
				r = mid-1;
			}
			else l = mid+1;
		}
		return r;
	}
	static int lowerBound(int[] nums, int target) {
		int mid = 0, l = 0, r = nums.length-1;
		while (l <= r) {
			mid = (l+r) / 2;
			if (nums[mid] >= target) {
				if (nums[mid] == target) flag = true;
				r = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		return r+1;
	}
    static int[] searchRange(int[] nums, int target) {
    	flag = false;
    	int lb = lowerBound(nums, target);
    	int ub = upperBound(nums, target);
    	
    	if (!flag) {
    		lb = -1;
    		ub = -1;
    	}
    	
    	int[] res = { lb, ub };
    	
    	return res;
    }
	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 6;
		int[] res = searchRange(nums, target);
		for (int el : res) {
			System.out.print(el + " ");
		}
	}
}
