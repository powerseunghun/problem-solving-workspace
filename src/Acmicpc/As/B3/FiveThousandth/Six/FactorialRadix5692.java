package Acmicpc.As.B3.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FactorialRadix5692 {
	static int[] factArr = new int[6];
	static void factArrInit() {
		Arrays.fill(factArr, 1);
		for (int i = 2; i < factArr.length; i++) {
			factArr[i] = factArr[i-1] * i;
		}
	}
	static int getN(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += ((str.charAt(i)-'0') * factArr[str.length()-i]);
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		factArrInit();
		
		while (true) {
			str = br.readLine();
			if (str.equals("0")) break;
			sb.append(getN(str) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
