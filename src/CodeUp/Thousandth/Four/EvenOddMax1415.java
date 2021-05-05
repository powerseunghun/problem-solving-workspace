package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EvenOddMax1415 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int eC = 0, oC = 0, maxE = 0, maxO = 0, max = 0;
		int tmp = 0;
		
		while (st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken());
			if (tmp % 2 == 0) {
				eC = 1;
				maxE = tmp >= maxE ? tmp : maxE;
			}
			else {
				oC = 1;
				maxO = tmp >= maxO ? tmp : maxO;
			}
		}
		max = maxE >= maxO ? maxE : maxO;
		
		if (eC == 0 || oC == 0) System.out.println(max);
		else System.out.println(maxO + " " + maxE);
	}
}
