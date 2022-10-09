package Acmicpc.As.B3.TwentyThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Katmandu23397 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int T = Integer.parseInt(tmp.split(" ")[0]);
		int D = Integer.parseInt(tmp.split(" ")[1]);
		int M = Integer.parseInt(tmp.split(" ")[2]), y0 = 0, y1 = 0;
		boolean flag = false;
		
		while(M-- > 0) {
			y1 = Integer.parseInt(br.readLine());
			flag = y1-y0 >= T ? true : flag;
			y0 = y1;
 		}
		flag = y1-y0 >= T ? true : flag;
		
		System.out.println(flag ? "Y" : "N");
		br.close();
	}
}
