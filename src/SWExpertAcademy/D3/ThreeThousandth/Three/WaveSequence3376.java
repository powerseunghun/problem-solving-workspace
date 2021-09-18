package SWExpertAcademy.D3.ThreeThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WaveSequence3376 {
	static ArrayList<Long> list = new ArrayList<>();
	static void listInit() {
		for (int i = 0 ; i < 3; i++) {
			list.add(1L);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		listInit();
		int T = Integer.parseInt(br.readLine()), N = 0, idx1 = 0, idx2 = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			idx1 = list.size()-3;
			idx2 = idx1++;
			while (list.size() < N) {
				list.add(list.get(idx1++)+list.get(idx2++));
			}
			sb.append("#" + i + " " + list.get(N-1) + "\n");
		}
		System.out.print(sb.toString());
	}
}
