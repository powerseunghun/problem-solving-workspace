package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GetMoleCularWeight1124 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "C|H");
		int[] weight = {12, 1};
		int sum = 0, idx = 0;
		
		while(st.hasMoreTokens()) {
			sum += (weight[idx++] * Integer.parseInt(st.nextToken()));
		}
		
		System.out.println(sum);
	}
}
