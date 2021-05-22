package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AssistantBattery2702 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0, max = 0;
		int[][] battery = new int[N][6];
		StringTokenizer st = null;
		for (int i = 0; i < battery.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < battery[i].length; j++) {
				battery[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < battery[0].length; i++) {
			max = 0;
			for (int j = 0; j < battery.length; j++) {
				max = battery[j][i] >= max ? battery[j][i] : max;
			}
			sum += max;
		}
		
		System.out.println(sum);
	}
}
