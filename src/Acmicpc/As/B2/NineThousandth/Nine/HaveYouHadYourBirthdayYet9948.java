package Acmicpc.As.B2.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HaveYouHadYourBirthdayYet9948 {
	static Map<String, Integer> map = new HashMap<>();
	static void mapInit() {
		String[] ms = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		for (int i = 1; i <= ms.length; i++) {
			map.put(ms[i-1], i);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null, m = null;
		int d = 0;
		mapInit();
		
		while(true) {
			str = br.readLine();
			m = str.split(" ")[1];
			d = Integer.parseInt(str.split(" ")[0]);
			if (m.equals("#") && d == 0) break;
			
			int y = map.get(m);
			if (y == 2 && d == 29) sb.append("Unlucky");
			else if (y < 8 || (y == 8 && d < 4)) sb.append("Yes");
			else if (y > 8 || (y == 8 && d > 4)) sb.append("No");
			else sb.append("Happy birthday");
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
