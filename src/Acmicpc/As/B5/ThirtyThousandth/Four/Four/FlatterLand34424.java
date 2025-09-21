package Acmicpc.As.B5.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlatterLand34424 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		
		System.out.println((n-1)*x);
		br.close();
	}
}
