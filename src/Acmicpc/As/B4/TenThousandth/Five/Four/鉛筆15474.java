package Acmicpc.As.B4.TenThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 鉛筆15474 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int A = Integer.parseInt(tmp.split(" ")[1]);
		int B = Integer.parseInt(tmp.split(" ")[2]);
		int C = Integer.parseInt(tmp.split(" ")[3]);
		int D = Integer.parseInt(tmp.split(" ")[4]);
		
		System.out.println(Math.min((N%A == 0 ? N/A : N/A+1) * B, (N%C == 0 ? N/C : N/C+1) * D));
		br.close();
	}
}
