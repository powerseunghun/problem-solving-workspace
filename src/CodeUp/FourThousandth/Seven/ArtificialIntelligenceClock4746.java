package CodeUp.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArtificialIntelligenceClock4746 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int h = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int s = Integer.parseInt(tmp.split(" ")[2]);
		int t = Integer.parseInt(br.readLine());
		
		s = s + (t % 60);
		if (s >= 60) {
			m += (s / 60);
			s = s % 60;
		}
		m = m + (t / 60);
		if (m >= 60) {
			h += (m / 60);
			m = m % 60;
		}
		if (h >= 24) {
			h = h % 24;
		}
		
		System.out.println(h + " " + m + " " + s);
	}
}
