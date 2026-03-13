package Acmicpc.As.B3.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositioningPetersPaintings34466 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		int X = Integer.parseInt(str.split(" ")[2]);
		int Y = Integer.parseInt(str.split(" ")[3]);
		
		System.out.println(Math.min(A+X+Math.max(B, Y), Math.max(A, X)+B+Y)*2);
		br.close();
	}
}
