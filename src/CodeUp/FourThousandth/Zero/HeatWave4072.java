package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HeatWave4072 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean flag1 = false, flag2 = false;
		double max = 0;
		
		while (st.hasMoreTokens()) {
			double val = Double.parseDouble(st.nextToken());
			max = max >= val ? max : val;
			if (val >= 33) {
				flag2 = true;
				if (val >= 35) flag1 = true;
			}
		}
		System.out.println(max);
		if (flag1) System.out.println("red");
		else {
			if (flag2) System.out.println("yellow");
			else System.out.println("green");
		}
		
	}
}
