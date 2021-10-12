package LettCode.Hundred.Medium;

public class P45JumpGame2 {
    static int jump(int[] nums) {
        int count = 0, seqMax = 0, nextSeqMax = 0;
        
        // each Seq Max value. 
        for (int i = 0; i < nums.length-1; i++) {
        	nextSeqMax = Math.max(i+nums[i], nextSeqMax);
        	if (i == seqMax) {
        		count++;
        		seqMax = nextSeqMax;
        	}
        }
    	return count;
    }
	public static void main(String[] args) {
		int[] nums = {2, 3, 1, 1, 4};
		
		System.out.println(jump(nums));
	}
}
