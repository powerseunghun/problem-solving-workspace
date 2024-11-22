package Acmicpc.As.B4.ThirtyThousandth.Two.Six;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class Janggi32684 {
	static final int p = 2;
	static double[] scores = new double[p];
	static int[] w = {13, 7, 5, 3, 3, 2};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for (int i = 0; i < p; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < w.length; j++) {
				scores[i] += Integer.parseInt(st.nextToken()) * w[j];
			}
		}
		
		System.out.println(scores[0] > scores[1]+1.5 ? "cocjr0208" : "ekwoo");
		br.close();
	}
}
