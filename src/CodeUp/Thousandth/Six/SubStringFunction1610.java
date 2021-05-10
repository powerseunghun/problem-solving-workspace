package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubStringFunction1610 {
	static String sub(String str, int s, int e) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < e; i++) {
			sb.append(str.charAt(s + i));
		}
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String tmp = br.readLine();
		int s = Integer.parseInt(tmp.split(" ")[0]);
		int e = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(sub(str, s, e));
	}
}
