package Acmicpc.As.B4.TenThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PieceOfCake17874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int h = Integer.parseInt(tmp.split(" ")[1]);
		int v = Integer.parseInt(tmp.split(" ")[2]);
		
		System.out.println(Math.max(h, n-h) * Math.max(v, n-v) * 4);
		br.close();
	}
}
