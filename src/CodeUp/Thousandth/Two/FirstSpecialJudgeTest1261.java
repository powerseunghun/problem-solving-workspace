package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FirstSpecialJudgeTest1261 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tmp = 0;
		boolean flag = false;
		
		while (st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken());
			if (tmp % 5 == 0) {
				System.out.println(tmp);
				flag = true;
				break;
			}
		}
		if (!flag) System.out.println("0");
	}
}
