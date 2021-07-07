package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardGame4836 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int numA = 0, numB = 0, winA = 0, winB = 0;
		
		while (st1.hasMoreTokens() && st2.hasMoreTokens()) {
			numA = Integer.parseInt(st1.nextToken());
			numB = Integer.parseInt(st2.nextToken());
			if (numA > numB) winA++;
			else if (numB > numA) winB++;
		}
		if (winA > winB) {
			System.out.println("A");
		}
		else if (winB > winA) {
			System.out.println("B");
		}
		else System.out.println("D");
	}
}
