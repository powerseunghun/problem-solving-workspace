package Acmicpc.OrderSubmit.TenThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaterBill10707 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		int price1 = A * P, price2 = P > C ? B+(Math.abs(P-C) * D) : B;
		
		System.out.println(Math.min(price1, price2));
		br.close();
	}
}
