package CodeUp.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetDivisor4621 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), cnt = 0;
		
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				cnt++;
				if (cnt == K) {
					System.out.println(i);
					return;
				}
			}
		}
		System.out.println("0");
	}
}
