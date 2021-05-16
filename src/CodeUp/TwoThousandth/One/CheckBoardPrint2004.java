package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckBoardPrint2004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w, h, w2, h2;
		String tmp = br.readLine();
		w = Integer.parseInt(tmp.split(" ")[0]);
		h = Integer.parseInt(tmp.split(" ")[1]);
		tmp = br.readLine();
		w2 = Integer.parseInt(tmp.split(" ")[0]);
		h2 = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0; i < w; i++) {
			for (int a = 0; a < w2; a++) {
				for (int j = 0; j < h; j++) {
					for (int b = 0; b < h2; b++) {
						System.out.print(i % 2 == 0 ? j % 2 == 0 ? 'X' : '.' : j % 2 == 0 ? '.' : 'X');
					}
				}
				System.out.println();
			}
		}
	}
}
