package Acmicpc.Geometry.TenThousandth.Six.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EulerTriangleTheorem16480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long R = Long.parseLong(tmp.split(" ")[0]);
		long r = Long.parseLong(tmp.split(" ")[1]);
		long ans = (long)(Math.pow(R, 2) - (2 * r * R));
		
		System.out.println(ans);
	}
}
