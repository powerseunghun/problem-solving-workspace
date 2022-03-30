package Acmicpc.OrderSubmit.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandyStore4781 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int n = 0, m = 0, c = 0, p = 0;
		
		while (true) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			m = (int)((Double.parseDouble(tmp.split(" ")[1]) * 100) + 0.5 / 100);
			
			if (n == 0 && m == 0) break;
			arr = new int[m+1];
			
			for (int i = 0; i < n; i++) {
				tmp = br.readLine();
				c = Integer.parseInt(tmp.split(" ")[0]);
				p = (int)((Double.parseDouble(tmp.split(" ")[1]) * 100) + 0.5 / 100);
				for (int j = p; j <= m; j++) {
					arr[j] = Math.max(arr[j], arr[j-p]+c);
				}
			}
			sb.append(arr[m] + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
