package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Donate1272 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tmp = 0, sum = 0;
		
		while (st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken());
			sum = tmp % 2 == 0 ? sum + (tmp / 2) * 10 : sum + (tmp / 2) + 1;
		}
		
		System.out.println(sum);
	}
}
