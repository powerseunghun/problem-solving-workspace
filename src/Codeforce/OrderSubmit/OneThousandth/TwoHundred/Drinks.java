package Codeforce.OrderSubmit.OneThousandth.TwoHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Drinks {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.printf("%.12f", ((double)sum / (n*100)) * 100);
		br.close();
	}
}
