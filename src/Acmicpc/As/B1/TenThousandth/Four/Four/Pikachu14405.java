package Acmicpc.As.B1.TenThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pikachu14405 {
	static String[] regs = {"pi", "ka", "chu"};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
//		for (String reg : regs) {
//			str = str.replaceAll(reg, "");
//		}
		str = str.replaceAll(String.join("|", regs), "");
		
		System.out.println(str.equals("") ? "YES" : "NO");
		br.close();
	}
}
