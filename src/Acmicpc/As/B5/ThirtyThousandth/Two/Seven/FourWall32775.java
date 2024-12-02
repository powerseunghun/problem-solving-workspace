package Acmicpc.As.B5.ThirtyThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourWall32775 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		
		System.out.println(s>f ? "flight" : "high speed rail");
		br.close();
	}
}
