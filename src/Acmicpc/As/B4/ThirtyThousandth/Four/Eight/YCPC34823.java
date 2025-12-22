package Acmicpc.As.B4.ThirtyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YCPC34823 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int y = Integer.parseInt(str.split(" ")[0]);
		int c = Integer.parseInt(str.split(" ")[1]);
		int p = Integer.parseInt(str.split(" ")[2]);
		
		System.out.println(Math.min(y, Math.min(c/2, p)));
		br.close();
	}
}
