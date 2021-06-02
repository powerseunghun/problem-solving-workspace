package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ParticipantList3108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = new int[10001];
		int[] unums = null;
		Map<Integer, String> list = new HashMap<>();
		int n = Integer.parseInt(br.readLine()), num = 0, idx = 0, find = 0;
		String flag = null, name = null, tmp = null;
		StringTokenizer st = null;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			flag = tmp.split(" ")[0];
			num = Integer.parseInt(tmp.split(" ")[1]);
			name = tmp.split(" ")[2];
			switch(flag) {
			case "I":
				if (nums[num] == 0) {
					nums[num] = 1;
					list.put(num, name);
				}
				break;
			case "D":
				if (nums[num] != 0) {
					nums[num] = 0;
					list.remove(num);
				}
				break;
			}
		}
		unums = new int[list.size()];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				unums[idx++] = i;
			}
		}
		st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			find = Integer.parseInt(st.nextToken());
			System.out.println(unums[find - 1] + " " + list.get(unums[find - 1]));
		}
	}
}
