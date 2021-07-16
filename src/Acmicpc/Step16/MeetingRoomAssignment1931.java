package Acmicpc.Step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomAssignment1931 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), st = 0, et = 0, count = 1;
		// col 0 st, col 1 et
		int[][] t = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			st = Integer.parseInt(tmp.split(" ")[0]);
			et = Integer.parseInt(tmp.split(" ")[1]);
			t[i][0] = st;
			t[i][1] = et;
		}
		
		Arrays.sort(t, new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[] t2) {
				if (t1[1] == t2[1]) return t1[0]-t2[0];
				else return t1[1]-t2[1];
			}
		});
		int endTime = t[0][1];
		for (int i = 1; i < t.length; i++) {
			if (t[i][0] >= endTime) {
				count++;
				endTime = t[i][1];
			}
		}
	
		System.out.println(count);
	}
}
