package Acmicpc.As.B3.TenThousandth.Seven.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeriousProblem17094 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String tmp = br.readLine();
		int cnt1 = 0, cnt2 = 0;
		
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) == '2') cnt1++;
			else if (tmp.charAt(i) == 'e') cnt2++;
		}
		
		System.out.println(cnt1==cnt2 ? "yee" : cnt1 > cnt2 ? "2" : "e");
		br.close();
	}
}
