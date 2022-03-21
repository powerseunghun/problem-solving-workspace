package Acmicpc.OrderSubmit.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeMultiple1769 {
	static boolean flag = false;
	static int func(String str) {
		int count = 0;
		long sum = 0;
		while (str.length() != 1) {
			sum = 0;
			count++;
			for (int i = 0; i < str.length(); i++) {
				sum += str.charAt(i)-'0';
			}
			str = sum + "";
		}
//		while (X >= 10) {
//			sum = 0;
//			while (X > 0) {
//				sum += X%10;
//				X /= 10;
//			}
//			count++;
//			X = sum;
//		}
		if (Integer.parseInt(str) % 3 == 0) flag = true;
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = func(str);
		
		System.out.println(res);
		System.out.println(flag ? "YES" : "NO");
		br.close();
	}
}