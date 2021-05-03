package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EvenCountOfN1268 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0, tmp = 0;
		
		while (st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken());
			cnt = tmp % 2 == 0 ? cnt + 1 : cnt;
		}
		System.out.println(cnt);
	}
}
