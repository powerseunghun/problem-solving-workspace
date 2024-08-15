package Acmicpc.As.B3.TenThousandth.Eight.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Questionnaire18964 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0, v = 0; i < N; i++) {
			v = Integer.parseInt(st.nextToken());
			if (v % 1 != 0) cnt++;
		}
		
		System.out.println("2 " + (cnt*2 >= N ? 1 : 0));
		br.close();
	}
}
