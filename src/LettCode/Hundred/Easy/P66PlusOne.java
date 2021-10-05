package LettCode.Hundred.Easy;

public class P66PlusOne {
    static int[] plusOne(int[] digits) {
    	int[] tmp = new int[digits.length], res = null;
    	int carry = 1;
    	for (int i = 0; i < tmp.length; i++) {
    		tmp[i] = digits[i];
    	}
    	
    	for (int i = tmp.length-1; i >= 0; i--) {
    		tmp[i] += carry;
    		if (tmp[i] >= 10) {
    			carry = 1;
    			tmp[i] = 0;
    		}
    		else carry = 0;
    	}
    	if (carry == 0) {
    		res = new int[digits.length];
    		for (int i = 0; i < tmp.length; i++) {
    			res[i] = tmp[i];
    		}
    	}
    	else {
    		res = new int[digits.length+1];
    		res[0] = 1;
    		for (int i = 1; i < tmp.length; i++) {
    			res[i] = tmp[i-1];
    		}
    	}
    	return res;
    }
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int[] digits = {1,2,3}, res = plusOne(digits);
		
		for (int el : res) {
			sb.append(el);
		}
		
		System.out.print(sb.toString());
	}
}
