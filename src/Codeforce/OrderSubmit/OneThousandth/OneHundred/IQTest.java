package Codeforce.OrderSubmit.OneThousandth.OneHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IQTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), cnt = 0;
		int val = 0, oddIdx = 0, evenIdx = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			val = Integer.parseInt(st.nextToken());
			if (val % 2 != 0) {
				cnt--;
				oddIdx = i+1;
			}
			else {
				cnt++;
				evenIdx = i+1;
			}
			
		}
		System.out.println(cnt > 0 ? oddIdx : evenIdx);
		br.close();
	}
}
