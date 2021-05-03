package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class LottoResult1226 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> list = new HashMap<>();
		int bonus = 0, tmp = 0, count = 0;
		boolean flag = false;
		
		for (int i = 0; i < 7; i++) {
			tmp = Integer.parseInt(st.nextToken());
			if (i == 6) {
				bonus = tmp;
			}
			else {
				if (!list.containsKey(tmp)) {
					list.put(tmp, tmp);
				}
			}
		}
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken());
			if (list.containsKey(tmp)) count++;
			if (bonus == tmp) flag = true;
		}
		
		switch(7 - count) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			if (flag) System.out.println("2");
			else System.out.println("3");
			break;
		case 3:
			System.out.println("4");
			break;
		case 4:
			System.out.println("5");
			break;
		default:
			System.out.println("0");
			break;
		}
	}
}
