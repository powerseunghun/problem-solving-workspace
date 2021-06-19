package CodeUp.DHTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Task1 {
	static Map<String, Integer> check = new HashMap<>();
//	static void check(String s) {
//		
//	}
	static String makeEmailAddress(String S, String C) {
		String email = "";
		String[] strs = S.split(" ");
		if (strs.length == 2) {
			if (strs[1].contains("-")) strs[1] = strs[1].replace("-", "");
			email += strs[0] + "." + strs[1];
		}
		else if(strs.length == 3) {
			if (strs[2].contains("-")) strs[2] = strs[2].replace("-", "");
			email += strs[0] + "." + strs[2];
		}
		
		if (!check.containsKey(email)) {
			check.put(email, 1);
		}
		else {
			check.put(email, check.get(email) + 1);
			email += check.get(email);
		}
		email += "@" + C + ".com";
		return email.toLowerCase();
	}
	static String solution(String S, String C) {
		StringTokenizer st = new StringTokenizer(S, ",");
		StringBuffer sb = new StringBuffer();
		StringBuilder sbd = new StringBuilder();
		
		String tmp = null;
		while(st.hasMoreTokens()) {
			tmp = st.nextToken();
			sb = new StringBuffer(tmp);
			if (sb.charAt(0) == ' ') {
				sb.deleteCharAt(0);
			}
			
			sbd.append(sb.toString() + " <" + makeEmailAddress(sb.toString(), C) + ">");
			if (st.hasMoreTokens()) sbd.append(", ");
		}
		
		return sbd.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(solution(str, "Example"));
	}
}
