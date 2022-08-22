package Acmicpc.As.B3.TenThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IncompleteBook15151 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int k = Integer.parseInt(tmp.split(" ")[0]), total = k;
		int l = Integer.parseInt(tmp.split(" ")[1]), cnt = 0;
		
		while (total <= l) {
			k *= 2;
			total += k;
			cnt++;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
