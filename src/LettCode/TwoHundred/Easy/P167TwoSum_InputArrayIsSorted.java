package LettCode.TwoHundred.Easy;

public class P167TwoSum_InputArrayIsSorted {
    static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int val = 0;
        for (int idx1 = 0, idx2 = numbers.length-1; idx1 < idx2;) {
            val = numbers[idx1] + numbers[idx2];
            if (val == target) {
                res[0] = idx1+1;
                res[1] = idx2+1;
                break;
            }
            else if (val < target) idx1++;
            else idx2--;
        }
        return res;
    }
	public static void main(String[] args) {
		
	}
}
