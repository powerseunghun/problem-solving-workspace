package Acmicpc.As.B3.TwentyThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class JavaScript23343 {
	static boolean check(String tmp) {
		String[] strs = tmp.split(" ");
		Set<Character> engs = new HashSet<>();
		for (char c = 'a', c2 = 'A'; c <= 'z'; c++, c2++) {
			engs.add(c);
			engs.add(c2);
		}
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < strs[i].length(); j++) {
				if (engs.contains(strs[i].charAt(j))) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int x = 0, y = 0;
		
		if (check(tmp)) {
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			System.out.println(x-y);
		}
		else System.out.println("NaN");
		
		br.close();
	}
}
