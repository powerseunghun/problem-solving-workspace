package Acmicpc.As.B1.TwentyThousandth.Eight.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz28702 {
	static final int len = 3;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = false;
		int t = 0;
		String str = null;
		
		for (int i = 0; i < len; i++) {
			str = br.readLine();
			if (str.replaceAll("[^0-9]", "").equals("")) continue;
			if (!flag) {
				t = Integer.parseInt(str)+len-i;
				flag = true;
			}
		}
		
		if (t % 3 == 0 && t % 5 == 0) {
			System.out.println("FizzBuzz");
		}
		else if (t % 3 == 0 && t % 5 != 0) {
			System.out.println("Fizz");
		}
		else if (t % 3 != 0 && t % 5 == 0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(t);
		}
		
		br.close();
	}
}
