package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeName1753 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = null;
		String[] cn = new String[n];
		
		for (int i = 0; i < n; i++) {
			sb = new StringBuilder(br.readLine());
			cn[i] = sb.reverse().toString();
			sb.deleteCharAt(0);
		}
		
		for (String str : cn) {
			System.out.println(str);
		}
		
	}
}
