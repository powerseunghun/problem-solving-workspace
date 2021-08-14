package Acmicpc.BruteForceAlgorithm.TenThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class DrawArrow15970 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<ArrayList<Integer>> colorList = new ArrayList<>();
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()), sum = 0;
		for (int i = 0; i <= N; i++) {
			colorList.add(new ArrayList<>());
		}
		for (int i = 0, x = 0, color = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			color = Integer.parseInt(st.nextToken());
			colorList.get(color).add(x);
		}
		for (int i = 0; i < colorList.size(); i++) {
			Collections.sort(colorList.get(i));
		}
		
		for (int i = 0, flag = 0; i < colorList.size(); i++, flag = 0) {
			ArrayList<Integer> tmp = colorList.get(i);
			for (int j = 0, val1 = 0, val2 = 0; j < tmp.size(); j++) {
				if (j == 0 || j == tmp.size()-1) {
					flag = 1;
					val1 = tmp.get(j);
					val2 = j == 0 ? tmp.get(j+1) : tmp.get(j-1);
				}
				else {
					flag = 0;
					val1 = Math.abs(tmp.get(j)-tmp.get(j-1));
					val2 = Math.abs(tmp.get(j)-tmp.get(j+1));
				}
				sum += flag == 1 ? Math.abs(val1-val2) : Math.min(val1, val2);
			}
		}
		System.out.println(sum);
	}
}
