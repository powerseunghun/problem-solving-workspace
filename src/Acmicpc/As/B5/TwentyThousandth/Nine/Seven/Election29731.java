package Acmicpc.As.B5.TwentyThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Election29731 {
	static Set<String> set = new HashSet<>();
	static void setInit() {
		set.add("Never gonna give you up");
		set.add("Never gonna let you down");
		set.add("Never gonna run around and desert you");
		set.add("Never gonna make you cry");
		set.add("Never gonna say goodbye");
		set.add("Never gonna tell a lie and hurt you");
		set.add("Never gonna stop");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		boolean flag = true;
		
		setInit();
		while(T-- > 0) {
			if (!set.contains(br.readLine())) {
				flag = false;
			}
		}
		
		System.out.println(!flag ? "Yes" : "No");
		br.close();
	}
}
