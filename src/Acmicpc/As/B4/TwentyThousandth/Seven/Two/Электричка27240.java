package Acmicpc.As.B4.TwentyThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Электричка27240 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int a = Integer.parseInt(str.split(" ")[1]);
		int b = Integer.parseInt(str.split(" ")[2]);
		str = br.readLine();
		int s = Integer.parseInt(str.split(" ")[0]);
		int t = Integer.parseInt(str.split(" ")[1]);
		
		if (s > t) {
			int tmp = s;
			s = t;
			t = tmp;
		}
		
		System.out.println(a<s && t<b ? "City" : (s>=b || t<=a) ? "Outside" : "Full");
		br.close();
	}
}
