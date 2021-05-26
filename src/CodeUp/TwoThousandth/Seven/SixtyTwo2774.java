package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SixtyTwo2774 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0;
		String tmp = null;
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			count = 0;
			for (int j = 0; j < tmp.length()-1; j++) {
				if (tmp.charAt(j) == '6' && tmp.charAt(j+1) == '2') count++;
			}
			System.out.println(count);
		}
	}
}
