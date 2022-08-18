package Acmicpc.As.B3.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindIdxInEqSeq14913 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int d = Integer.parseInt(tmp.split(" ")[1]);
		int k = Integer.parseInt(tmp.split(" ")[2]);
		double res = (k-a) / (double)d;
		
		if (res < 0 || res != (int)res) System.out.println("X");
		else System.out.println(((int)res) + 1);
		br.close();
	}
}
