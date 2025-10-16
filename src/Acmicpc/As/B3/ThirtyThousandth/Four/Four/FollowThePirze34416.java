package Acmicpc.As.B3.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FollowThePirze34416 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int k = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine()), v1 = 0, v2 = 0;
		String str = null;
		
		while(m-- > 0) {
			str = br.readLine();
			v1 = Integer.parseInt(str.split(" ")[0]);
			v2 = Integer.parseInt(str.split(" ")[1]);
			if (k == v1) {
				k = v2;
			} else if (k == v2) {
				k = v1;
			}
		}
		
		System.out.println(k);
		br.close();
	}
}
