package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CalorieCalculator1210 {
	public static void main(String[] args) throws IOException {
		int[] calrories = {0, 400, 340, 170, 100, 70};
		int sum = 0;
		
		Map<Integer, Integer> menu = new HashMap<>();
		for (int i = 1; i < calrories.length; i++) {
			menu.put(i, calrories[i]);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			sum += (int)menu.get(Integer.parseInt(st.nextToken()));
		}
		
		if (sum > 500) {
			System.out.println("angry");
		}
		else {
			System.out.println("no angry");
		}
	}
}
