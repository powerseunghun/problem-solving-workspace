package Acmicpc.As.B4.ThirtyThousandth.Two.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhysicsMath32025 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.MAX_VALUE;
		
		r = Math.min(Integer.parseInt(br.readLine()), r);
		r = Math.min(Integer.parseInt(br.readLine()), r);
		
		System.out.println((int)(r / 2.0 * 100));
		br.close();
	}
}
