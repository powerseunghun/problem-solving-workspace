package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakeOneDimensionDiffArray1494 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]), k = Integer.parseInt(tmp.split(" ")[1]);
		int[] d = new int[n+2];
		Arrays.fill(d, 0);
		
		for (int i = 0, s = 0, e = 0, u = 0; i < k; i++) {
			tmp = br.readLine();
			s = Integer.parseInt(tmp.split(" ")[0]);
			e = Integer.parseInt(tmp.split(" ")[1]);
			u = Integer.parseInt(tmp.split(" ")[2]);
			d[s] += u;
			d[e+1] -= u;
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.print(d[i] + " ");
		}
		System.out.println();
		for (int i = 2; i <= n; i++) {
			d[i] += d[i-1];
		}
		for (int i = 1; i <= n; i++) {
			System.out.print(d[i] + " ");
		}
	}
}
