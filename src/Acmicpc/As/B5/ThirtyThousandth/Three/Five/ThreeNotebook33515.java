package Acmicpc.As.B5.ThirtyThousandth.Three.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNotebook33515 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(Math.min(Integer.parseInt(str.split(" ")[0]), Integer.parseInt(str.split(" ")[1])));
		br.close();
	}
}
