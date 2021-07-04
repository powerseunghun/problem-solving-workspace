package CodeUp.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntelligenceTrain4711 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int sum = 0, out = 0, in = 0, max = 0;
		
		for (int i = 0; i < 4; i++) {
			tmp = br.readLine();
			out = Integer.parseInt(tmp.split(" ")[0]);
			in = Integer.parseInt(tmp.split(" ")[1]);
			sum -= out;
			sum += in;
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}
}
