package Acmicpc.As.B3.TwentyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecretInstructions21614 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int lot = 0;
		String str = null, dir = null;
		
		while (true) {
			str = br.readLine();
			if (str.equals("99999")) {
				break;
			}
			lot = (str.charAt(0)-'0' + str.charAt(1)-'0');
			if (lot != 0 && lot % 2 == 0) {
				dir = "right";
			}
			else if (lot != 0 && lot % 2 != 0) {
				dir = "left";
			}
			sb.append(dir + " " + (Integer.parseInt(str) % 1000) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
