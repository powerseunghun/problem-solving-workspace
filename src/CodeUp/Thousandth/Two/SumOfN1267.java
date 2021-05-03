package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfN1267 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0, tmp = 0;
		
		while (st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken());
			sum = tmp % 5 == 0 ? sum + tmp : sum;
		}
		System.out.println(sum);
	}
}
