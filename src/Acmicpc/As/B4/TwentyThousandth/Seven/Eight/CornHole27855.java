package Acmicpc.As.B4.TwentyThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CornHole27855 {
	static final int w = 3;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		str = br.readLine();
		int c = Integer.parseInt(str.split(" ")[0]);
		int d = Integer.parseInt(str.split(" ")[1]);
		
		int res1 = w*a+b, res2 = w*c+d, diff = Math.abs(res1-res2);
		
		System.out.println(res1 == res2 ? "NO SCORE" : res1 > res2 ? "1 " + diff : "2 " + diff);
		br.close();
	}
}
