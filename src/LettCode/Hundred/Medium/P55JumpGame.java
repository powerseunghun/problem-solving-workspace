package LettCode.Hundred.Medium;
	
public class P55JumpGame {
    static boolean canJump(int[] nums) {
        int goalIdx = nums.length-1;
        for (int i = nums.length-1; i >= 0; i--) {
            if (i+nums[i] >= goalIdx) {
                goalIdx = i;
            }
        }
        return goalIdx == 0;
    }
	public static void main(String[] args) {
		
	}
}
