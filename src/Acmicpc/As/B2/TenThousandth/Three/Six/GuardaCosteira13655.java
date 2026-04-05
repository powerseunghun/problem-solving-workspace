package Acmicpc.As.B2.TenThousandth.Three.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuardaCosteira13655 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int d = 0, vf = 0, vg = 0;
		
		while((str = br.readLine()) != null) {
			d = Integer.parseInt(str.split(" ")[0]);
			vf = Integer.parseInt(str.split(" ")[1]);
			vg = Integer.parseInt(str.split(" ")[2]);
			sb.append(Math.sqrt(Math.pow(d, 2)+Math.pow(12, 2)) * vf > 12*vg ? "N" : "S").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
