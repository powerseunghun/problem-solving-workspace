package LettCode.Hundred.Medium;

public class P80RemoveDuplicatesFromSotrtedArray2 {
    static int removeDuplicates(int[] nums) {
        int res = 0;
        for (int el : nums) {
        	if (res < 2 || el != nums[res-2]) {
        		nums[res] = el;
        		res++;
        	}
        }
        
        return res;
    }
	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		System.out.println(removeDuplicates(nums));
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}
