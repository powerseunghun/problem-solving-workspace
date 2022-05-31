package Acmicpc.As.B3.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpeedLimit4635 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0, s = 0, t = 0, sum = 0;
		int beforeTime = 0;
		String tmp = null;
		
		while (true) {
			n = Integer.parseInt(br.readLine());
			if (n == -1) break;
			sum = 0;
			beforeTime = 0;
			for (int i = 0; i < n; i++) {
				tmp = br.readLine();
				s = Integer.parseInt(tmp.split(" ")[0]);
				t = Integer.parseInt(tmp.split(" ")[1]);
				sum += s * (beforeTime == 0 ? t : t-beforeTime);
				beforeTime = t;
			}
			sb.append(sum + " miles\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
