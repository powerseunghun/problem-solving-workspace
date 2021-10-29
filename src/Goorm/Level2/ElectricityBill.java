package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectricityBill {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int kw = Integer.parseInt(br.readLine()), flag = 3;
		double[] weight = {0.5, 0.7, 0.9, 1.0};
		
		if (kw < 100) {
			flag = 0;
		}
		else if (kw < 200) {
			flag = 1;
		}
		else if (kw < 300) {
			flag = 2;
		}
		System.out.printf("%.2f", kw * weight[flag] / 100);
	}
}
