package Acmicpc.As.B3.TenThousandth.Three.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OlympicGames13773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int year = 0;
		
		while(true) {
			year = Integer.parseInt(br.readLine());
			if (year == 0) break;
			if (year % 4 != 0 || year < 1896) sb.append(year + " No summer games\n");
			else if (year > 2020) sb.append(year + " No city yet chosen\n");
			else if ((year >= 1914 && year <= 1918) || (year >= 1939 && year <= 1945)) {
				sb.append(year + " Games cancelled\n");
			}
			else sb.append(year + " Summer Olympics\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
