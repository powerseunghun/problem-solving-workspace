package SWExpertAcademy.D1.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewPaperHeadLine2047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) >= 'a' && tmp.charAt(i) <= 'z') {
				sb.append((char)(tmp.charAt(i)-32));
			}
			else sb.append(tmp.charAt(i));
		}
		System.out.println(sb.toString());
	}
}
