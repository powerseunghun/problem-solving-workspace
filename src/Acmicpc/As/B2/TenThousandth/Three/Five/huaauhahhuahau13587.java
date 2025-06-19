package Acmicpc.As.B2.TenThousandth.Three.Five;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class huaauhahhuahau13587 {
	static boolean func(String str) {
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length()-i-1)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(func(str.replaceAll("[^a|e|i|o|u]", "")) ? "S" : "N");
		br.close();
	}
}
