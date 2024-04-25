package Acmicpc.As.B3.ThirtyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaṭṭtaSuma30067 {
	static final int limit = 10;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0;
		
		for (int i = 0; i < limit; i++) {
			res += Integer.parseInt(br.readLine());
		}
		
		System.out.println(res/2);
		br.close();
	}
}
