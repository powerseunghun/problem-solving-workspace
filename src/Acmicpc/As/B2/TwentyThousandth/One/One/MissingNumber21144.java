package Acmicpc.As.B2.TwentyThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber21144 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		int target = 9, w = 1, res = 0;
		boolean flag = false;
		
		for (int i = 0, n = 1, val = 0; i < str.length(); i+=w) {
			res++;
			val = Integer.parseInt(str.substring(i, i+w));
			if (n != val) {
				flag = true;
				break;
			}
			n++;
			if (val == target) {
				i--;
				w++;
				target *= 10;
				target += 9;
			}
		}
		System.out.println(flag ? res : res+1);
		br.close();
	}
}
