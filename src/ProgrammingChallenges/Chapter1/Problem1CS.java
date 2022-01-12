package ProgrammingChallenges.Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1CS {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		long lbound = 0, ubound = 0, lbOrg = 0, ubOrg = 0, temp = 0;
		long i = 0, j = 0, length = 0, max_length = 0;
		
		while (true) {
			tmp = br.readLine();
			if (tmp.equals("")) break;
			lbound = Long.parseLong(tmp.split(" ")[0]);
			ubound = Long.parseLong(tmp.split(" ")[1]);
			
			lbOrg = lbound;
			ubOrg = ubound;
			
			/* 입력된 구간 값들 중 앞의 것이 더 크면 바꾼다. */
			if (lbound > ubound) {
				temp = lbound;
				lbound = ubound;
				ubound = temp;
			}
			max_length = 0;
			
			for (i = lbound; i <= ubound; i++) {
				j = i;
				length = 1;
				while (j != 1) {
					if (j % 2 == 1) {
						j = j * 3 + 1;
						length++;
					}
					while (j % 2 != 1) {
						j /= 2;
						length++;
					}
				}
				if (length > max_length) {
					max_length = length;
				}
			}
			System.out.println(lbOrg + " " + ubOrg + " " + max_length);
		}
	}
}
