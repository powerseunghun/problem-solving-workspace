package LettCode.Hundred.Easy;

public class P27RemoveElement {
    static int removeElement(int[] nums, int val) {
        int idx = 0, base = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[base] != val) {
                nums[idx] = nums[base];
                idx++;
            }
            base++;
        }
        return idx;
    }
    public static void main(String[] args) {
    	int[] arr = {0, 1, 2, 3, 3, 4};
		int k = removeElement(arr, 3);
	}
}
