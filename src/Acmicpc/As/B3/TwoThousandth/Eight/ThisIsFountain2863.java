package Acmicpc.As.B3.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThisIsFountain2863 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double A = 0, B = 0, C = 0, D = 0, max = Integer.MIN_VALUE, count = 5, tmpVal = 0;
		String tmp = null;
		
		for (int i = 0; i < 2; i++) {
			tmp = br.readLine();
			switch(i) {
			case 0:
				A = Double.parseDouble(tmp.split(" ")[0]);
				B = Double.parseDouble(tmp.split(" ")[1]);
				break;
			case 1:
				C = Double.parseDouble(tmp.split(" ")[0]);
				D = Double.parseDouble(tmp.split(" ")[1]);
				break;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			switch(i) {
			case 0:
				tmpVal = A/C + B/D;
				break;
			case 1:
				tmpVal = C/D + A/B;
				break;
			case 2:
				tmpVal = D/B + C/A;
				break;
			case 3:
				tmpVal = B/A + D/C;
				break;
			}
			if (tmpVal > max) {
				max = tmpVal;
				count = i;
			}
		}
		
		System.out.println((int)count);
		br.close();
	}
}
