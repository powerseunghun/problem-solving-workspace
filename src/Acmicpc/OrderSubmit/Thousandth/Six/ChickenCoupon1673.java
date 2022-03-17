package Acmicpc.OrderSubmit.Thousandth.Six;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChickenCoupon1673 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int n = 0, k = 0, count = 0;
		
		while((tmp = br.readLine()) != null) {
			n = Integer.parseInt(tmp.split(" ")[0]);
			k = Integer.parseInt(tmp.split(" ")[1]);
			count = n;
			while (n/k != 0) {
				count += (n/k);
				n = n/k + n%k;
			}
			sb.append(count + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
