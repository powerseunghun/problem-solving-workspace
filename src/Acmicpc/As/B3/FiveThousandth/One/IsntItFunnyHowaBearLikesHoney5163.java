package Acmicpc.As.B3.FiveThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsntItFunnyHowaBearLikesHoney5163 {
	static final double PI = 3.14159265359;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()), b = 0;
		double w = 0, r = 0, t = 0;
		String tmp = null;
		
		for (int i = 1; i <= K; i++) {
			tmp = br.readLine();
			b = Integer.parseInt(tmp.split(" ")[0]);
			w = Double.parseDouble(tmp.split(" ")[1]);
			t = 0;
			for (int j = 1; j <= b; j++) {
				r = Double.parseDouble(br.readLine());
				t += (4.0/3.0 * PI * Math.pow(r, 3) / 1000);
			}
			
			sb.append("Data Set " + i + ":\n");
			sb.append(t >= w ? "Yes\n" : "No\n");
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
