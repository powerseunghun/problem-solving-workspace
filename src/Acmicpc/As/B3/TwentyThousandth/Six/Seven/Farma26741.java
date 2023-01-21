package Acmicpc.As.B3.TwentyThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Farma26741 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0, H = 0, B = 0, K = 0;
		String tmp = null;
		
		while(N-- > 0) {
			tmp = br.readLine();
			H = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			K = Integer.parseInt(tmp.split(" ")[2]);
			if (H >= B) continue;
			
			res += Math.abs(B-H) * K;
		}
		
		System.out.println(res);
		br.close();
	}
}
