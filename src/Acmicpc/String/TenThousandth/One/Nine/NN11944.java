package Acmicpc.String.TenThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NN11944 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String N = tmp.split(" ")[0];
		String M = tmp.split(" ")[1];
		int count = 0, idx = 0;
		if ((N.length() * (Integer.parseInt(N))) > Integer.parseInt(M)) {
			while(true) {
				System.out.print(N.charAt(idx));
				count++;
				idx+=1;
				idx %= N.length();
				if (count >= Integer.parseInt(M)) break;
			}
		}
		else {
			for (int i = 0; i < Integer.parseInt(N); i++) {
				System.out.print(N);
			}
		}
		
	}
}
