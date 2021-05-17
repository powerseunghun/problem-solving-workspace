package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcelColumnOrder2023 {
	static void getAlpha(int n) {
		if (n < 1) return;
		else {
			getAlpha((n-1) / 26);
			System.out.print((char)(((n-1) % 26) + 65));
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		getAlpha(Integer.parseInt(br.readLine()));
	}
}
