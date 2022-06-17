package Acmicpc.As.B3.SixThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodTimes6812 {
	static int func(int t) {
		int ct = t;
		ct = ct % 100 > 59 ? ct+40 : ct;
		ct = ct % 100 < -59 ? ct-40 : ct;
		ct = t < 0 ? t+2400 : ct;
		ct = ct > 2399 ? ct % 2400 : ct;
		return ct;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		System.out.println(t + " in Ottawa");
		System.out.println(func(t-300) + " in Victoria");
		System.out.println(func(t-200) + " in Edmonton");
        System.out.println(func(t-100) + " in Winnipeg");
        System.out.println(t + " in Toronto");
        System.out.println(func(t+100) + " in Halifax");
        System.out.println(func(t+130) + " in St. John's");
        br.close();
	}
}
