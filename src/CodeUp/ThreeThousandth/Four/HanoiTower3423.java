package CodeUp.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower3423 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 1, weight = 2, count = 0, countLimit = 2;
		for (int i = 1; i < N; i++) {
			sum += weight;
			count++;
			if (count == countLimit) {
				count = 0;
				weight *= 2;
				countLimit += 1;
			}
		}
		System.out.println(sum);
	}
}
