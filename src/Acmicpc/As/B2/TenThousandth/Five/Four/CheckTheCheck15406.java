package Acmicpc.As.B2.TenThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckTheCheck15406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int a = 0, b = 0, t = 0, sum = 0;
		
		while(true) {
			str = br.readLine();
			if (str.equals("TOTAL")) {
				t = Integer.parseInt(br.readLine());
				break;
			}
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			sum += a*b;
		}
		
		System.out.println(t > sum ? "PROTEST" : "PAY");
		br.close();
	}
}
