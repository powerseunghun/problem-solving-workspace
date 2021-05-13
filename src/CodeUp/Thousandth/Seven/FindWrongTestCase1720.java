package CodeUp.Thousandth.Seven;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class FindWrongTestCase1720 {
	static int getMinValue(int a, int b, int c) {
		return a >= b ? b >= c ? c : b : a >= c ? c : a;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 0, b = 0, c = 0, d = 0;
		boolean flag = false;
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			c = Integer.parseInt(tmp.split(" ")[2]);
			d = Integer.parseInt(tmp.split(" ")[3]);
			if (getMinValue(a, b, c) != d) {
				flag = true;
				sb.append((i+1) + " " + getMinValue(a, b, c));
			}
		}
		
		if (!flag) System.out.println("-1");
		else System.out.println(sb);
	}
}
