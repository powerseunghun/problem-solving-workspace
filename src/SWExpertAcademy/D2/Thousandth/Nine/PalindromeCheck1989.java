package SWExpertAcademy.D2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeCheck1989 {
	static int check(String str) {
		for (int i = 0, j = str.length()-1; i < str.length()/2; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) return 0;
		}
		return 1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			str = br.readLine();
			sb.append("#" + i + " " + check(str) + "\n");
		}
		System.out.print(sb.toString());
	}
}
