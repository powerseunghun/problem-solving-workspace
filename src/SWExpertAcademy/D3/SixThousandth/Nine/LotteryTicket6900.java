package SWExpertAcademy.D3.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LotteryTicket6900 {
	static Map<String, Integer> map = new HashMap<>();
	static long check(String[] strs1, String[] strs2) {
		long sum = 0;
		boolean flag = true;
		String str1 = null, str2 = null;
		for (int i = 0; i < strs2.length; i++) {
			str1 = strs2[i];
			for (int j = 0; j < strs1.length; j++) {
				str2 = strs1[j];
				flag = true;
				for (int k = 0; k < str2.length(); k++) {
					if (str2.charAt(k) == '*') continue;
					else {
						if (str1.charAt(k) != str2.charAt(k)) {
							flag = false;
							break;
						}
					}
				}
				if (flag) sum += map.get(str2);
			}
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		String[] strs1 = null, strs2 = null;
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0;
		
		for (int i = 1; i <= T; i++) {
			map.clear();
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			strs1 = new String[N];
			strs2 = new String[M];
			for (int j = 0; j < N; j++) {
				tmp = br.readLine();
				strs1[j] = tmp.split(" ")[0];
				map.put(strs1[j], Integer.parseInt(tmp.split(" ")[1]));
			}
			for (int j = 0; j < M; j++) {
				strs2[j] = br.readLine();
			}
			sb.append("#" + i + " " + check(strs1, strs2) + "\n");
		}
		System.out.print(sb.toString());
	}
}
