package Acmicpc.As.B3.TenThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SocialGame16785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int C = Integer.parseInt(tmp.split(" ")[2]), day = 0, res = 0;
		
		while (res < C) {
			res += A;
			day++;
			if (day % 7 == 0) res += B;
		}
		
		System.out.println(day);
		br.close();
	}
}
