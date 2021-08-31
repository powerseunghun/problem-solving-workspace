package SWExpertAcademy.D2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleThreeSixNine1926 {
	static int clapCount(String tmp) {
		int count = 0;
		for (int i = 0; i < tmp.length(); i++) {
			switch(tmp.charAt(i)) {
			case '3': case '6': case '9':
				count++;
				break;
			}
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		for (int i = 1; i <= N; i++) {
			tmp = String.valueOf(i);
			if (tmp.contains("3") || tmp.contains("6") || tmp.contains("9")) {
				for (int j = 0; j < clapCount(tmp); j++) {
					sb.append("-");
				}
				sb.append(" ");
			}
			else sb.append(tmp + " ");
		}
		System.out.println(sb.toString());
	}
}
