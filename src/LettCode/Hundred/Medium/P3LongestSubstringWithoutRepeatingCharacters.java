package LettCode.Hundred.Medium;

public class P3LongestSubstringWithoutRepeatingCharacters {
    static int lengthOfLongestSubstring(String s) {
        String tmp = "", res = "";
        int sIdx = 0, idx = 0;
        for (int i = 0; i < s.length(); i++) {
        	idx = tmp.indexOf(s.charAt(i));
        	if (idx != -1) {
        		sIdx = sIdx+idx+1;
        	}
        	tmp = s.substring(sIdx, i+1);
        	if (res.length() < tmp.length()) {
        		res = tmp;
        	}
        }
        return res.length();
    }
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
}
