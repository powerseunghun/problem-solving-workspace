package Acmicpc.As.B3.TwentyThousandth.Seven.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class NotPrimeComposite27465 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = N, tVal = 0; ; i++) {
			set.clear();
			tVal = i;
			set.add(1);
			for (int j = 2; j <= Math.sqrt(i); j++) {
				while (tVal % j == 0) {
					tVal /= j;
					set.add(j);
				}
			}
			if (tVal > 1) {
				set.add(tVal);
			}
			set.add(i);
			if (set.size() != 2) {
				res = i;
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
