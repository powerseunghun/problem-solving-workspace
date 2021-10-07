package LettCode.TwoHundred.Easy;

public class P125ValidPalindrome {
	static boolean check(String str) {
        for (int i = 0, j = str.length()-1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
            	return false;
            }
        }
        return true;
    }
    static boolean isPalindrome(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                str += s.charAt(i);
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') str += s.charAt(i);
        }
        
        str = str.toLowerCase();
        return check(str);
    }
	public static void main(String[] args) {
		System.out.println(isPalindrome("race a car"));
	}
}
