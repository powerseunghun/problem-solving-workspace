package Codeforce.OrderSubmit.FourHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HelpfulMaths {
	static int[] nums = new int[4];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), "+");
		
		while (st.hasMoreTokens()) {
			nums[Integer.parseInt(st.nextToken())]++;
		}
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < nums[i]; j++) {
				sb.append(i+"+");
			}
		}
		
		System.out.println(sb.replace(sb.toString().length()-1, sb.toString().length(), ""));
		br.close();
	}
}
