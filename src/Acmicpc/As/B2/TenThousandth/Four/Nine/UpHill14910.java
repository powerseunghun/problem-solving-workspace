package Acmicpc.As.B2.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class UpHill14910 {
	static List<Integer> list = new ArrayList<Integer>();
	static boolean func() {
		for (int i = 0, v = 0; i < list.size()-1; i++) {
			if (list.get(i) > list.get(i+1)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			list.add(v);
		}
		
		System.out.println(func() ? "Good" : "Bad");
		br.close();
	}
}
