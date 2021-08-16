package Acmicpc.Sorting.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class PaperCutting2628 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		ArrayList<Integer> wCut = new ArrayList<>();
		ArrayList<Integer> hCut = new ArrayList<>();
		int w = Integer.parseInt(tmp.split(" ")[0]);
		int h = Integer.parseInt(tmp.split(" ")[1]);
		int T = Integer.parseInt(br.readLine()), maxW = 0, maxH = 0;
		
		for (int i = 0, dir = 0, val = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			dir = Integer.parseInt(st.nextToken());
			val = Integer.parseInt(st.nextToken());
			if (dir == 0) hCut.add(val);
			else wCut.add(val);
		}
		wCut.add(w);
		hCut.add(h);
		Collections.sort(wCut);
		Collections.sort(hCut);
		
		for (int i = 0, val = 0; i < wCut.size(); i++) {
			val = i == 0 ? wCut.get(i) : wCut.get(i) - wCut.get(i-1);
			maxW = Math.max(maxW, val);
		}
		for (int i = 0, val = 0; i < hCut.size(); i++) {
			val = i == 0 ? hCut.get(i) : hCut.get(i) - hCut.get(i-1);
			maxH = Math.max(maxH, val);
		}
		
		System.out.println(maxW * maxH);
	}
}
