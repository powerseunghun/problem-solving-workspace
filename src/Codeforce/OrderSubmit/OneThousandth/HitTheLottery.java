package Codeforce.OrderSubmit.OneThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class HitTheLottery {
	static Integer[] bills = {1, 5, 10, 20, 100};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0;
		Arrays.sort(bills, Collections.reverseOrder());
		
		for (int i = 0, c = 0; i < bills.length; i++) {
			c = N / bills[i];
			count += c;
			N -= (c * bills[i]);
		}
		
		System.out.println(count);
		br.close();
	}
}
