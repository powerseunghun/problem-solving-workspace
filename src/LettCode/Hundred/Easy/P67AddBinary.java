package LettCode.Hundred.Easy;

public class P67AddBinary {
	static String addBinary(String a, String b) {
		String t1 = a.length()>=b.length() ? a : b;
		String t2 = "";
		StringBuilder sb = new StringBuilder();
		int carry = 0, val = 0;
		if (a.length() >= b.length()) {
			for (int i = 0; i < a.length()-b.length(); i++) t2 += "0";
			t2 += b;
		}
		else {
			for (int i = 0; i < b.length()-a.length(); i++) t2 += "0";
			t2 += a;
		}
		
		for (int i = t1.length()-1, val1 = 0, val2 = 0; i >= 0; i--) {
			val1 = t1.charAt(i)-'0';
			val2 = t2.charAt(i)-'0';
			val = val1+val2+carry;
			carry = val >= 2 ? 1 : 0;
			sb.append((val%2) + "");
		}
		if (carry == 1) {
			sb.append("1");
		}
        return sb.reverse().toString();
    }
	public static void main(String[] args) {
		String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		System.out.println(addBinary(a, b));
	}
}
