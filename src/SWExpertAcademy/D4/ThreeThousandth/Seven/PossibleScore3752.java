package SWExpertAcademy.D4.ThreeThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class PossibleScore3752 {
	static int[] arr = null;
	static Set<Integer> set = new HashSet<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		Set<Integer> tSet = new HashSet<>();
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			set.clear();
			set.add(0);
			tSet.clear();
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 0; j < arr.length; j++) {
				tSet.addAll(set);
				Iterator<Integer> iter = tSet.iterator();
				while (iter.hasNext()) {
					set.add(iter.next()+arr[j]);
				}
			}
			sb.append("#" + i + " " + set.size() + "\n");
		}
		System.out.print(sb.toString());
	}
}
