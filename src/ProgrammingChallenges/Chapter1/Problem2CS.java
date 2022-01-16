package ProgrammingChallenges.Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2CS {
	static final int MAX_N = 100;
	static final int MAX_M = 100;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = 0, m = 0, i = 0, j = 0, i2 = 0, j2 = 0, field_id = 0;
		/* mf는 char 배열로서, 문자 '0'(의 ASCII 값)으로 초기화한다.
		 * 주변에 지뢰가 있을때마다 배열 값을 1씩 증가시키면 그 값이 '1', '2' ... 가 되므로
		 * 문자 그대로 출력하면 된다.
		 */
		char[][] mf = new char[MAX_N + 2][MAX_M + 2];
		
		field_id = 1;
		while (true) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			m = Integer.parseInt(tmp.split(" ")[1]);
			if (n == 0 && m == 0) break;
			
			/* mine field 초기화 */
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= m; j++) {
					mf[i][j] = '0';
				}
			}
			
			/* 입력을 받으면서 동시에 그 줄을 처리함 */
			for (i = 1; i <= n; i++) {
				tmp = br.readLine();
				for (j = 1; j <= m; j++) {
					if (tmp.charAt(j-1) == '*') {
						for (i2 = i-1; i2 <= i+1; i2++) {
							for (j2 = j-1; j2 <= j+1; j2++) {
								if(mf[i2][j2] != '*') mf[i2][j2]++;
							}
						}
						mf[i][j] = '*';
					}
				}
			}
			/* 출력 */
			if (field_id > 1) System.out.println();
			System.out.printf("Field #%d:\n", field_id++);
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= m; j++) {
					System.out.print(mf[i][j]);
				}
				System.out.println();
			}
		}
	}
}
