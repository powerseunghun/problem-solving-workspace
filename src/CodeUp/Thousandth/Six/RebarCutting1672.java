package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RebarCutting1672 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		
		if (n /k > 9999) {
			System.out.println("번호 초과 오류");
			return;
		}
		
		for (int i = 1; i <= n/k; i++) {
			System.out.printf("F-%04d\n", i);
		}
	}
}
