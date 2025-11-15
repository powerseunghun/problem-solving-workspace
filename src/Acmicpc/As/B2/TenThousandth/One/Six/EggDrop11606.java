package Acmicpc.As.B2.TenThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EggDrop11606 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int k = Integer.parseInt(str.split(" ")[1]), v = 0, p = 1, q = k;
		
		while(n-- > 0) {
			str = br.readLine();
			v = Integer.parseInt(str.split(" ")[0]);
			str = str.split(" ")[1];
			if (str.equals("SAFE")) {
				p = Math.max(p, v);
			} else {
				q = Math.min(q, v);
			}
		}
		
		System.out.println((p+1) + " " + (q-1));
		br.close();
	}
}
