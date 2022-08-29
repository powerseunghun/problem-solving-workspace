package Acmicpc.As.B3.TenThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teleportation15751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int x = Integer.parseInt(tmp.split(" ")[2]);
		int y = Integer.parseInt(tmp.split(" ")[3]);
		
		int dist1 = Math.abs(a-b);
		int dist2 = Math.abs(a-x) + Math.abs(y-b);
		int dist3 = Math.abs(a-y) + Math.abs(x-b);
		
		System.out.println(Math.min(dist1, Math.min(dist2, dist3)));
		br.close();
	}
}
