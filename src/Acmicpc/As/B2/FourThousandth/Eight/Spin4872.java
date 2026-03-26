package Acmicpc.As.B2.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spin4872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String res = br.readLine(), str = null;
		
		while((str = br.readLine()) != null) {
			String tRes = "";
			for (int i = 0, v = 0; i < str.length(); i++) {
				v = ((res.charAt(i)-'0') + (str.charAt(i)-'0'))%10;
				tRes += v;
			}
			res = tRes;
		}
		System.out.println(res);
		br.close();
	}
}
