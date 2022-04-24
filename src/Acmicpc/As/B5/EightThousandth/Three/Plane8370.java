package Acmicpc.As.B5.EightThousandth.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Plane8370 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n1 = Integer.parseInt(tmp.split(" ")[0]);
		int k1 = Integer.parseInt(tmp.split(" ")[1]);
		int n2 = Integer.parseInt(tmp.split(" ")[2]);
		int k2 = Integer.parseInt(tmp.split(" ")[3]);
		
		System.out.println((n1*k1) + (n2*k2));
		br.close();
	}
}
