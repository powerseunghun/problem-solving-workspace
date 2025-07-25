package Acmicpc.As.B4.ThirtyThousandth.Three.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SciComLove33810 {
	static final String dest = "SciComLove";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != dest.charAt(i)) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
