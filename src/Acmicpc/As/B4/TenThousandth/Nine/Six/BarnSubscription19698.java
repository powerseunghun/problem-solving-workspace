package Acmicpc.As.B4.TenThousandth.Nine.Six;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BarnSubscription19698 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int W = Integer.parseInt(tmp.split(" ")[1]);
		int H = Integer.parseInt(tmp.split(" ")[2]);
		int L = Integer.parseInt(tmp.split(" ")[3]);
		
		System.out.println(Math.min(N, (W/L) * (H/L)));
		br.close();
	}
}
