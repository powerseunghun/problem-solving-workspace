package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreeIntegerAvg1120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		
		while (st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.printf("%.2f", sum / 3.0);
	}
}
