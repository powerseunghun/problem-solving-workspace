package Acmicpc.As.B3.TwentyThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcademicDistance23103 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0, curX = 0, curY = 0, x = 0, y = 0;
		String tmp = null;
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			
			res = i == 0 ? 0 : res + Math.abs(curX-x) + Math.abs(curY-y);
			curX = x;
			curY = y;
		}
		
		System.out.println(res);
		br.close();
	}
}
