package Acmicpc.As.B2.TwentyThousandth.Three.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpinKnob23756 {
	static final int deg = 360;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine())+1, V = 0, F = 0, res = 0;
		boolean flag = false;
		
		while(T-- > 0) {		
			V = Integer.parseInt(br.readLine());
			res += flag ? Math.min(Math.abs(F-V), Math.min(360-F+V, F+360-V)) : 0;
			flag = true;
			F = V;
		}
		
		System.out.println(res);
		br.close();
	}
}
