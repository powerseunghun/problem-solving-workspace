package Codeforce.OrderSubmit.TwoThousandth.OneHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InSearchOfAnEasyProblem {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		String res = "EASY";
		
		while (st.hasMoreTokens()) {
			n = Integer.parseInt(st.nextToken());
			if (n == 1) {
				res = res.replaceAll("EASY", "HARD");
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
