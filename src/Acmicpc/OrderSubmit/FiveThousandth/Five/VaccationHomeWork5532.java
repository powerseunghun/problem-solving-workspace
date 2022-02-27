package Acmicpc.OrderSubmit.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VaccationHomeWork5532 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int res1 = (A % C == 0) ? A / C : (A / C) + 1;
		int res2 = (B % D == 0) ? B / D : (B / D) + 1;
		
		System.out.println(L - Math.max(res1, res2));
		br.close();
	}
}
