package Acmicpc.String.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FBI2857 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for (int i = 1; i <= 5; i++) {
			tmp = br.readLine();
			if (tmp.contains("FBI")) {
				flag = true;
				sb.append(i + " ");
			}
		}
		if (flag) System.out.println(sb.toString());
		else System.out.println("HE GOT AWAY!");
	}
}
