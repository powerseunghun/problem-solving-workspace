package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoomBatch4877 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int C = Integer.parseInt(tmp.split(" ")[2]);
		int N = Integer.parseInt(tmp.split(" ")[3]);
		
		for (int i = 0; i*A <= N; i++) {
			for (int j = 0; (i*A)+(j*B) <= N; j++) {
				int c = N-((i*A)+(j*B));
				if (c % C == 0) {
					System.out.println("1");
					return;
				}
			}
		}
		System.out.println("0");
		
	}
}
