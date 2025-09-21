package Acmicpc.As.B5.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RollerCoasterRide34454 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		
		System.out.println(N <= C*P ? "yes" : "no");
		br.close();
	}
}
