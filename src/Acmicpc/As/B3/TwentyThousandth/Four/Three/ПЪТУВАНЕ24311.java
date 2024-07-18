package Acmicpc.As.B3.TwentyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ПЪТУВАНЕ24311 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int t1 = Integer.parseInt(str.split(" ")[0]);
		int t2 = Integer.parseInt(str.split(" ")[1]);
		int t3 = Integer.parseInt(br.readLine());
		str = br.readLine();
		int t4 = Integer.parseInt(str.split(" ")[0]);
		int t5 = Integer.parseInt(str.split(" ")[1]);
		int br2 = Integer.parseInt(br.readLine());
		int t6 = Integer.parseInt(br.readLine());
		int res = (t1-t4) * 60 + t2-10-t3-t5-(br2+1) * t6;
		
		System.out.println((res/60 < 10 ? "0" : "") + (res/60) + " " + (res%60 < 10 ? "0" : "") + (res%60));
		br.close();
	}
}
