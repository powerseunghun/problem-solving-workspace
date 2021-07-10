package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TtakjiGame4876 {
	static char check(int[] child1, int[] child2) {
		for (int  i = child1.length-1; i >= 0; i--) {
			if (child1[i] == child2[i]) continue;
			if (child1[i] > child2[i]) {
				return 'A';
			}
			else if (child1[i] < child2[i]) {
				return 'B';
			}
		}
		return 'D';
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0;
		int[] child1 = new int[4], child2 = new int[4];
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			Arrays.fill(child1, 0);
			Arrays.fill(child2, 0);
			a = Integer.parseInt(tmp.split(" ")[0]);
			for (int j = 1; j <= a; j++) {
				child1[Integer.parseInt(tmp.split(" ")[j])-1]++;
			}
			tmp = br.readLine();
			b = Integer.parseInt(tmp.split(" ")[0]);
			for (int j = 1; j <= b; j++) {
				child2[Integer.parseInt(tmp.split(" ")[j])-1]++;
			}
			System.out.println(check(child1, child2));
		}
	}
}
