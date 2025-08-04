package Acmicpc.As.B4.ThirtyThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourHourWall32776 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sab = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int ma = Integer.parseInt(str.split(" ")[0]);
		int fab = Integer.parseInt(str.split(" ")[1]);
		int mb = Integer.parseInt(str.split(" ")[2]);
		
		System.out.println(sab > ma+fab+mb && sab > 240 ? "flight" : "high speed rail");
		br.close();
	}
}
