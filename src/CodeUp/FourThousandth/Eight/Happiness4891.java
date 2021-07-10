package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Happiness4891 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int val = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			max = val >= max ? val : max;
			min = val >= min ? min : val;
		}
		System.out.println(max - min);
	}
}
