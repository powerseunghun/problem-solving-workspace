package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RootProblem2010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int B = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]);
		int l = 0, h = 0, lValue = 0, hValue = 0, index = 0; 
		
		while (l == 0 || h == 0) {
			int value = (int) Math.pow(index, N);
			if (value <= B) {
				l = 1;
				lValue = index;
			}
			if (value >= B) {
				h = 1;
				hValue = index;
			}
			index++;
		}
		
		if (Math.abs(B - (int)Math.pow(lValue, N)) <= Math.abs(B - (int)Math.pow(hValue, N))) {
			System.out.println(lValue);
		}
		else {
			System.out.println(hValue);
		}
	}
}
