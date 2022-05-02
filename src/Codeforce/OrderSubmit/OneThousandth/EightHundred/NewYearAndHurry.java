package Codeforce.OrderSubmit.OneThousandth.EightHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewYearAndHurry {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]),k = Integer.parseInt(tmp.split(" ")[1]);
		int w = 5, sum = 0, count = 0;
		
		for (int i = 1; i <= n;i++) {
			sum += (i * w);
			if (sum > (240-k)) break;
			count++;
		}
		
		System.out.println(count);
		br.close();
	}
}
