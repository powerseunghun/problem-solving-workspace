package LettCode.Hundred.Easy;

import java.util.StringTokenizer;

public class P58LengthOfLastWord {
    static int lengthOfLastWord(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String str = null;
        while (st.hasMoreTokens()) {
        	str = st.nextToken();
        }
        return str.length();
    }
	public static void main(String[] args) {
		
	}
}
