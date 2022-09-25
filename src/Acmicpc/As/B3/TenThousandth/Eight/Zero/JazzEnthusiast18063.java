package Acmicpc.As.B3.TenThousandth.Eight.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JazzEnthusiast18063 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int c = Integer.parseInt(tmp.split(" ")[1]);
		int h = 0, m = 0, s = 0, sum = 0;
		
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			sum += (Integer.parseInt(tmp.split(":")[0]) * 60);
			sum += (Integer.parseInt(tmp.split(":")[1]));
		}
		sum -= (c*(n-1));
		h = sum / 3600;
		m = (sum - (h*3600)) / 60;
		s = sum % 60;
		
		System.out.println(String.format("%02d:%02d:%02d\n", h, m, s));
		br.close();
	}
}
