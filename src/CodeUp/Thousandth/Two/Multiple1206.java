package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple1206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		if (a % b == 0) {
			sb.append(b + "*" + (a / b) + "=" + a);
		}
		else if (b % a == 0) {
			sb.append(a + "*" + (b / a) + "=" + b);
		}
		else {
			sb.append("none");
		}
		
		System.out.println(sb);
	}
}
