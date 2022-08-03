package Acmicpc.As.B3.TenThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Manhattan13221 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int x = Integer.parseInt(tmp.split(" ")[0]), y = Integer.parseInt(tmp.split(" ")[1]);
		int N = Integer.parseInt(br.readLine()), min = Integer.MAX_VALUE;
		int cmpX = 0, cmpY = 0, resX = 0, resY = 0;
		
		while (N-- > 0) {
			tmp = br.readLine();
			cmpX = Integer.parseInt(tmp.split(" ")[0]);
			cmpY = Integer.parseInt(tmp.split(" ")[1]);
			
			if (Math.abs(cmpX-x) + Math.abs(cmpY-y) < min) {
				resX = cmpX;
				resY = cmpY;
				min = Math.abs(cmpX-x)+Math.abs(cmpY-y);
			}
		}
		
		System.out.println(resX + " " + resY);
		br.close();
	}
}
