package Acmicpc.Step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average1546 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0, score = 0, idx = 0;
		double sum = 0;
		
		int[] scores = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			score = Integer.parseInt(st.nextToken());
			scores[idx++] = score;
			max = max >= score ? max : score;
		}
		
		for (int i = 0; i < scores.length; i++) {
			sum += (double) scores[i] / max * 100;
		}
		
		System.out.println(sum / N);
	}
}
