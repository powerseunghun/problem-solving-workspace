package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PossibleSeat2035 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] chairs = new int[Integer.parseInt(br.readLine()) + 2];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		
		for (int i = 1; i < chairs.length - 1; i++) {
			chairs[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < chairs.length - 1; i++) {
			if (chairs[i] == 0) {
				if (chairs[i-1] == 0 && chairs[i+1] == 0) count++;
			}
		}
		
		System.out.println(count);
	}
}
