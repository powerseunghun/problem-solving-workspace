package Acmicpc.As.B3.TenThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FineInn12756 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[2], h = new int[2];
		String tmp = null;
		
		for (int i = 0; i < 2; i++) {
			tmp = br.readLine();
			a[i] = Integer.parseInt(tmp.split(" ")[0]);
			h[i] = Integer.parseInt(tmp.split(" ")[1]);
		}
		
		while(h[0] > 0 && h[1] > 0) {
			h[0] -= a[1];
			h[1] -= a[0];
		}
		
		if (h[0] <= 0 && h[1] <= 0) System.out.println("DRAW");
		else if (h[0] <= 0) System.out.println("PLAYER B");
		else System.out.println("PLYAER A");
		
		br.close();
	}
}
