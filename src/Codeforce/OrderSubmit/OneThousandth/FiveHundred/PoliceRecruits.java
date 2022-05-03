package Codeforce.OrderSubmit.OneThousandth.FiveHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PoliceRecruits {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int pc = 0, val = 0, count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			if (val == -1) {
				if (pc <= 0) {
					count++;
					continue;
				}
				pc--;
			}
			else pc += val;
		}
		
		System.out.println(count);
		br.close();
	}
}
