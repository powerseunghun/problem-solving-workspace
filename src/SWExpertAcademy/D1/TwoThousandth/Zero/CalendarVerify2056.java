package SWExpertAcademy.D1.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalendarVerify2056 {
	static boolean verify(String str) {
		int month = Integer.parseInt(str.substring(4, 6));
		int day = Integer.parseInt(str.substring(6, 8));
		
		if (!(month >= 1 && month <= 12)) return false;
		
		switch(month) {
		case 2:
			if (day >= 1 && day <=28) return true;
			break;
		case 4: case 6: case 9: case 11:
			if (day >= 1 && day <= 30) return true;
		default:
			if (day >= 1 && day <= 31) return true;
		}
		
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			if (!verify(tmp)) {
				sb.append("#" + i + " -1\n");
				continue;
			}
			sb.append("#" + i + " " + tmp.substring(0, 4) + "/" + tmp.substring(4, 6) + "/" + tmp.substring(6, 8) + "\n");
		}
		System.out.print(sb.toString());
	}
}
