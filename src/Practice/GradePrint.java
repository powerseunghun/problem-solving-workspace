package Practice;

import java.util.Scanner;

public class GradePrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;;
		int[] scores = new int[n];
		
		for (int i = 0; i < n; i++) {
			int score = sc.nextInt();
			scores[i] = score;
		}
		
		for (int i = 0; i < scores.length; i++) {
			count = 1;
			System.out.print(scores[i] + " ");
			for (int j = 0; j < scores.length; j++) {
				if (i == j) continue;
				if (scores[i] < scores[j]) count++;
			}
			System.out.println(count);
		}
		
	}
}
