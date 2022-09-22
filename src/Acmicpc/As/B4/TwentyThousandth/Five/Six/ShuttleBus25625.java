package Acmicpc.As.B4.TwentyThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShuttleBus25625 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int x = Integer.parseInt(tmp.split(" ")[0]);
		int y = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(y > x ? (y-x) : x == y ? 0 : (x+y));
		br.close();
	}
}
