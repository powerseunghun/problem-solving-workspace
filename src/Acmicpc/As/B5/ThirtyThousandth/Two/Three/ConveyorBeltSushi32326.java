package Acmicpc.As.B5.ThirtyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConveyorBeltSushi32326 {
	static final int l = 3;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0;
		
		for (int i = 1, v = 0, w = 2; i <= l; i++) {
			res += Integer.parseInt(br.readLine()) * (i+w);
		}
		
		System.out.println(res);
		br.close();
	}
}
