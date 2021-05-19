package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LinearStructureSearch2082 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean flag = false;
		
		for (int i = 0; i < n; i++) {
			if (Integer.parseInt(st.nextToken()) == k) {
				System.out.println(i+1);
				return;
			}
		}
		
		System.out.println("-1");
	}
}
