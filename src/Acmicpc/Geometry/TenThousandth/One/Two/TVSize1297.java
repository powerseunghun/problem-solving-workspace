package Acmicpc.Geometry.TenThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TVSize1297 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int D = Integer.parseInt(tmp.split(" ")[0]);
		int H = Integer.parseInt(tmp.split(" ")[1]);
		int W = Integer.parseInt(tmp.split(" ")[2]);
		double DD = Math.sqrt(H*H + W*W);
		
		System.out.print((int)Math.floor(D*H/DD) + " ");
		System.out.println((int)Math.floor(D*W/DD));
	}
}
