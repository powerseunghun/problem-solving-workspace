package Acmicpc.As.B2.FourThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Acmicpc.Sorting.TwoThousandth.Nine.FeequencySort2910;

public class SaveMoney4998 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		double N = 0, B = 0, M = 0;
		int res = 0;
		
		while ((tmp = br.readLine()) != null) {
			N = Double.parseDouble(tmp.split(" ")[0]);
			B = Double.parseDouble(tmp.split(" ")[1]);
			M = Double.parseDouble(tmp.split(" ")[2]);
			res = 0;
			
			while (N <= M) {
				res++;
				N += N / 100 * B;
			}
			
			sb.append(res).append("\n");
			System.out.println("res : " + res);
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
