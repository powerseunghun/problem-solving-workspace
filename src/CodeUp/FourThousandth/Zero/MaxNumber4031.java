package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxNumber4031 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int evenMax = 0, oddMax = 0;
		
		for (int i = 0; i < 7; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			switch(tmp % 2) {
			case 0:
				evenMax = evenMax >= tmp ? evenMax : tmp;
				break;
			case 1:
				oddMax = oddMax >= tmp ? oddMax : tmp;
				break;
			}
		}
		System.out.println(oddMax + evenMax);
	}
}
