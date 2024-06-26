package Acmicpc.As.B4.ThirtyThousandth.One.Sevcen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class GahuiAndSousenKyo30791 {
	static final int b = 1000;
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0;
		
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list, Collections.reverseOrder());
		
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) + b >= list.get(0)) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
