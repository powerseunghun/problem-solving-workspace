package Acmicpc.As.B3.ThirtyThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Knob30617 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), lt = 0, rt = 0, preLt = 0, preRt = 0, res = 0;
		String str = null;
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			lt = Integer.parseInt(str.split(" ")[0]);
			rt = Integer.parseInt(str.split(" ")[1]);
			
			if (i > 0) {
				if (lt != 0 && lt == preLt) res++;
				if (rt != 0 && rt == preRt) res++;
			}
			if (lt != 0 && rt != 0 && lt == rt) res++;
			
			preLt = lt;
			preRt = rt;
		}
		
		System.out.println(res);
		br.close();
	}
}
