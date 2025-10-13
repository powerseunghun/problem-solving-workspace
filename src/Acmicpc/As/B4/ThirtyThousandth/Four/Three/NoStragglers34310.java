package Acmicpc.As.B4.ThirtyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NoStragglers34310 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v = 0, res = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			v = Integer.parseInt(str.split(" ")[2]);
			res += str.contains("IN") ? v : (v*-1);
		}
		
		System.out.println(res != 0 ? res : "NO STRAGGLERS");
		br.close();
	}
}
