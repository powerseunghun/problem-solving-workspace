package CodeUp.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalcScore4626 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int weight = 0, score = 0, val = 0;
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			if (val == 1) {
				score += (1 + weight++);
			}
			else weight = 0;
		}
		
		System.out.println(score);
	}
}
