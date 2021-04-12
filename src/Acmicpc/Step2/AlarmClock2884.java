package Acmicpc.Step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlarmClock2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		int H = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		
		if ((M -= 45) < 0) {
			M += 60;
			if ((H -= 1) < 0) {
				H += 24;
			}
		}
		System.out.println(H + " " + M);
	}
}