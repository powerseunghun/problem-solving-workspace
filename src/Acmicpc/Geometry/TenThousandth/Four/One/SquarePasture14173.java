package Acmicpc.Geometry.TenThousandth.Four.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SquarePasture14173 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[] inputs = new int[8];
		int res1 = 0, res2 = 0;
		
		for (int i = 0, idx = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				inputs[idx++] = Integer.parseInt(st.nextToken());
			}
		}
		res1 = Math.max(inputs[6], inputs[2]) - Math.min(inputs[4], inputs[0]);
		res2 = Math.max(inputs[7], inputs[3]) - Math.min(inputs[5], inputs[1]);
		
		System.out.println(Math.max(res1, res2) * Math.max(res1, res2));
	}
}
