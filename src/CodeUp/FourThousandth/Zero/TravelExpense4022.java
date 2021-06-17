package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TravelExpense4022 {
	static int[] rest = { 15, 15, 30 };
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int D = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		int H = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		int sum = 0, tmp = 0;
		
		if (D >= 120) {
			sum += ((H-1) * 40000);
			sum += (Math.ceil(D / (double)10) * 1000);
			if (H == 1) sum += 5000;
			else sum += ((H-1) * 3 + 1) * 5000;
			
			tmp = H;
			if (tmp == 1) {
				sum += 20000;
			}
			else {
				double weight = 1;
				for (int i = 0; i < 4; i++, weight-=0.1) {
					if (tmp <= 0) break;
					if (i == 3) {
						sum += (tmp * 20000 * 0.5 * weight);
					}
					else {
						if (tmp > rest[i]) {
							sum += (rest[i] * 20000 * 0.5 * weight);
						}
						else sum += (tmp * 20000 * 0.5 * weight);
						tmp -= rest[i];
					}
				}
			}
		}
		else {
			sum += (H * 20000);
			sum += (H * 5000);
			sum += (H * Math.ceil(D / (double)10) * 1000);
		}
		System.out.println(sum);
	}
}
