package LettCode.Hundred.Medium;

import java.io.IOException;

public class P38CountAndSay {
    static String countAndSay(int n) {
        if (n == 1) return "1";
        int count = 1;
        char base = ' ';
        String tmp = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < tmp.length(); i++) {
        	base = tmp.charAt(i);
        	count = 1;
        	for (int j = i+1; j < tmp.length(); j++) {
        		if (tmp.charAt(j) != base) break;
        		count++;
        	}
        	i += (count-1);
        	sb.append((count+""+base));
        }
        
        return sb.toString();
    }
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println(countAndSay(6));
	}
}
