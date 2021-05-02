package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YourStudentID1170 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int idx = 0;
		while (st.hasMoreTokens()) {
			int tmp = Integer.parseInt(st.nextToken());
			if (idx == 2) {
				if (tmp < 10) {
					sb.append("0");
				}
			}
			sb.append(tmp);
			idx++;
		}
		
		System.out.println(sb);
	}
}
