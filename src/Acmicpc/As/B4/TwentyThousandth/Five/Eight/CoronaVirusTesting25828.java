package Acmicpc.As.B4.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoronaVirusTesting25828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int g = Integer.parseInt(tmp.split(" ")[0]);
		int p = Integer.parseInt(tmp.split(" ")[1]);
		int t = Integer.parseInt(tmp.split(" ")[2]);
		int res1 = g*p;
		int res2 = g+(p*t);
		
		System.out.println(res1==res2 ? "0" : res1 < res2 ? "1" : "2");
		br.close();
	}
}
