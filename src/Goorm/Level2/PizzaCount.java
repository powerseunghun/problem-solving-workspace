package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaCount {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]), coupon = n;
		int m = Integer.parseInt(tmp.split(" ")[1]), val = 0;
		
		while (coupon >= m) {
			val = coupon / m;
			n += val;
			coupon %= m;
			coupon += val;
		}
		System.out.println(n);
	}
}
