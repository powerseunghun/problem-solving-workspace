package CodeUp.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardPlay4756 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int valA = 0, valB = 0, sumA = 0, sumB = 0;
		char lastWinner = ' ';
		
		while(st1.hasMoreTokens() && st2.hasMoreTokens()) {
			valA = Integer.parseInt(st1.nextToken());
			valB = Integer.parseInt(st2.nextToken());
			
			if (valA > valB) {
				sumA += 3;
				lastWinner = 'A';
			}
			else if (valB > valA) {
				sumB += 3;
				lastWinner = 'B';
			}
			else {
				sumA++;
				sumB++;
			}
		}
		System.out.println(sumA + " " + sumB);
		if (sumA > sumB) {
			System.out.println("A");
		}
		else if (sumB < sumA) {
			System.out.println("B");
		}
		else {
			switch(lastWinner) {
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
				break;
			default:
				System.out.println("D");
				break;
			}
		}
	}
}
