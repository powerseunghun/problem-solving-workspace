package Acmicpc.As.B3.TenThousandth.Six.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KoreaUnivWineCollect16673 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int C = Integer.parseInt(tmp.split(" ")[0]); 
		int K = Integer.parseInt(tmp.split(" ")[1]); 
		int P = Integer.parseInt(tmp.split(" ")[2]);
		int sum = 0;
		
		for (int i = 1; i <= C; i++) {
			sum += (i*K) + (Math.pow(i, 2)*P);
		}
		
		System.out.println(sum);
		br.close();
	}
}
