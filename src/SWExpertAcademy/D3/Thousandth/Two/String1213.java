package SWExpertAcademy.D3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String1213 {
	static int getCnt(String sub, String str) {
		int idx = 0, cnt = 0;
		while (str.indexOf(sub) != -1) {
			cnt++;
			idx = str.indexOf(sub) + sub.length();
			if (idx > str.length()) break;
			str = str.substring(idx, str.length());
		}
		return cnt;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String sub = null, str = null;
		for (int i = 1; i <= 10; i++) {
			br.readLine();
			sub = br.readLine();
			str = br.readLine();
			sb.append("#" + i + " " + getCnt(sub, str) + "\n");
		}
		System.out.print(sb.toString());
	}
}
