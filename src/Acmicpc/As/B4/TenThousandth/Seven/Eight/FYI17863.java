package Acmicpc.As.B4.TenThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FYI17863 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		if (str.substring(0, 3).equals("555")) System.out.println("YES");
		else System.out.println("NO");
		
		br.close();
	}
}
