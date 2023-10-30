package Acmicpc.As.S5.TenThousandth.Three.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WindowClose13909 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), t = 1, res = 0;
		
		while(t*t <= N) {
			t++;
			res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
