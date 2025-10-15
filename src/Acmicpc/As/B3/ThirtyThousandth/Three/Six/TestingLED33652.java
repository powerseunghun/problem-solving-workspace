package Acmicpc.As.B3.ThirtyThousandth.Three.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestingLED33652 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M = 0, O = 0, res = Integer.MAX_VALUE;
		String str = null;
		boolean flag = true;
		
		while(N-- > 0) {
			str = br.readLine();
			M = Integer.parseInt(str.split(" ")[0]);
			O = Integer.parseInt(str.split(" ")[1]);
			
			if (O == 0) {
				flag = false;
				res = Math.min(res, M);
			}
		}
		
		System.out.println(flag ? -1 : res);
		br.close();
	}
}
