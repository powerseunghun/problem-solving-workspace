package Acmicpc.OrderSubmit.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ball1547 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int M = Integer.parseInt(br.readLine()), curLoc = 1;
		
		for (int i = 0, X = 0, Y = 0; i < M; i++) {
			tmp = br.readLine();
			X = Integer.parseInt(tmp.split(" ")[0]);
			Y = Integer.parseInt(tmp.split(" ")[1]);
			if (X == curLoc || Y == curLoc) {
				curLoc = X == curLoc ? Y : X;
			}
		}
		
		System.out.println(curLoc);
		br.close();
	}
}
