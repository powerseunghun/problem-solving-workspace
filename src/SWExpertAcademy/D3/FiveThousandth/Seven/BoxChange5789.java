package SWExpertAcademy.D3.FiveThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoxChange5789 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, Q = 0, L = 0, R = 0;
		int[] arr = null;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			Q = Integer.parseInt(tmp.split(" ")[1]);
			arr = new int[N];
			for (int j = 1; j <= Q; j++) {
				tmp = br.readLine();
				L = Integer.parseInt(tmp.split(" ")[0]);
				R = Integer.parseInt(tmp.split(" ")[1]);
				for (int k = L-1; k <= R-1; k++) {
					arr[k] = j;
				}
			}
			sb.append("#" + i + " ");
			for (int el : arr) {
				sb.append(el + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
