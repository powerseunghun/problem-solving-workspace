package Codeforce.OrderSubmit.OneThousandth.ThreeHundered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitPlusPlus {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = 0, T = Integer.parseInt(br.readLine());
		String tmp = null;
		
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			if (tmp.charAt(0) == 'X') {
				X += tmp.charAt(tmp.length()-1) == '+' ? 1 : -1;
			}
			else if (tmp.charAt(0) == '-' || tmp.charAt(0) == '+') {
				X += tmp.charAt(0) == '+' ? 1 : -1;
			}
		}
		
		System.out.println(X);
		br.close();
	}
}
