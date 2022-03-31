package Acmicpc.OrderSubmit.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExampleScore5596 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[] scores = new int[2];
		
		for (int i = 0, sum = 0; i < scores.length; i++, sum = 0) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			scores[i] = sum;
		}
		
		System.out.println(Math.max(scores[0], scores[1]));
		br.close();
	}
}
