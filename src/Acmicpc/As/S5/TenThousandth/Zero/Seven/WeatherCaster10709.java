package Acmicpc.As.S5.TenThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeatherCaster10709 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int H = Integer.parseInt(str.split(" ")[0]), idx = 0;
		
		for (int i = 0; i < H; i++) {
			str = br.readLine();
			idx = -1;
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if (c == 'c') {
					sb.append(0);
					idx = j;
				}
				else if (idx == -1) {
					sb.append(idx);
				}
				else {
					sb.append(j-idx);
				}
				if (j == str.length()-1) continue;
				sb.append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
