package SWExpertAcademy.D3.FiveThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AssignmentCheck5431 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String tmp = null;
		int[] arr = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				arr[Integer.parseInt(st.nextToken())-1] = 1;
			}
			sb.append("#" + i + " ");
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 0) sb.append((j+1) + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
