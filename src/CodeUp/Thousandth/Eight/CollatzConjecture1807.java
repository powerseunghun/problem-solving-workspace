package CodeUp.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CollatzConjecture1807 {
	static int Conjecture(int n) {
		int count = 1;
		while (n != 1) {
			count++;
			n = n % 2 == 0 ? n / 2 : 3 * n + 1;
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int maxIdx = 1;
		
		for (int i = a; i <= b; i++) {
			maxIdx = Conjecture(i) > Conjecture(maxIdx) ? i : maxIdx;
		}
		
		System.out.println(maxIdx + " " + Conjecture(maxIdx));
		
	}
}
