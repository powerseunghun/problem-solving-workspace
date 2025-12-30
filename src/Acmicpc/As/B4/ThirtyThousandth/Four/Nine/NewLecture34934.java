package Acmicpc.As.B4.ThirtyThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewLecture34934 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), y = 0, max = 0;
		String str = null, res = null;
		
		while(N-- > 0) {
			str = br.readLine();
			y = Integer.parseInt(str.split(" ")[1]);
			if (y > max) {
				max = y;
				res = str.split(" ")[0];
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
