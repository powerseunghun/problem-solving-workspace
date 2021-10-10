package LettCode.Hundred.Easy;

public class P14LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String base = strs[0];
        if (strs.length == 1) return base;
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < base.length(); i++) {
            flag = true;
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || base.charAt(i) != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) sb.append(base.charAt(i));
            else break;
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		String[] strs = {""};
		System.out.print(longestCommonPrefix(strs));
	}
}
