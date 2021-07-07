package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Belt4847 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int M = Integer.parseInt(br.readLine()), count = 1;
		int iSpin = 0, jSpin = 0, spin = 0, spinDir = 0;
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			iSpin = Integer.parseInt(tmp.split(" ")[0]);
			jSpin = Integer.parseInt(tmp.split(" ")[1]);
			spin = Integer.parseInt(tmp.split(" ")[2]);
			if (spin == 1) spinDir = spinDir == 0 ? 1 : 0;
			count = (count * jSpin) / iSpin;
		}
		
		System.out.println(spinDir + " " + count);
	}
}
