package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LookAndSaySequence2018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String str = "1";
		int n = 1;
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		while (n <= b) {
			String print = "";
			for (int i = 0; i < str.length(); i++) {
				print += str.charAt(i) + " ";
			}
			if (n >= a && n <= b) {
				System.out.println(print);
			}
			int cnt = 0;
			char find = str.charAt(0);
			String t = "";
			for (int i = 0; i < str.length(); i++) {
				if (find == str.charAt(i)) {
					cnt++;
				}
				else {
					t += "" + find + cnt;
					cnt = 0;
					find = str.charAt(i);
					cnt++;
				}
				if (i == str.length()-1) {
					t += "" + find + cnt;
				}
			}
			str = t.toString();
			n++;
		}
	}
}
