package LettCode.TwoHundred.Easy;

public class P191NumberOf1Bits {
    // you need to treat n as an unsigned value
    static int hammingWeight(int n) {
        int count = 0;
        String str = Integer.toBinaryString(n);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') count++;
        }
        return count;
    }
    public static void main(String[] args) {
		
	}
}
