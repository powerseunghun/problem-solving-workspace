package LettCode.Hundred.Medium;

public class P33SearchInRotatedSortedArray {
	static int binarySearch(int nums[], int l, int r, int target) {
		int mid = (l+r) / 2;
		if (l > r) return -1;
		if (nums[mid] == target) return mid;
		
		// l <= mid (left subtree is sorted)
		if (nums[l] <= nums[mid]) {
			// target range l <= target <= mid
			if (nums[l] <= target && nums[mid] >= target) {
				// left subtree
				return binarySearch(nums, l, mid-1, target);
			}
			else return binarySearch(nums, mid+1, r, target);
		}
		// l > mid (right subtree is sorted)
		else {
			// target range mid <= target <= r
			if (nums[mid] <= target && nums[r] >= target) {
				// right subtree
				return binarySearch(nums, mid+1, r, target);
			}
			else return binarySearch(nums, l, mid-1, target);
		}
	}
	public static void main(String[] args) {
		
	}
}
