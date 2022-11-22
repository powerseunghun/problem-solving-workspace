package Acmicpc.As.B3.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WindowOnTheWall25869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int X = Integer.parseInt(tmp.split(" ")[0]);
		int Y = Integer.parseInt(tmp.split(" ")[1]);
		int t = Integer.parseInt(tmp.split(" ")[2]);
		
		X = X-2*t > 0 ? X-2*t : 0;
		Y = Y-2*t > 0 ? Y-2*t : 0;
		
		System.out.println(X*Y);
		br.close();
	}
}
