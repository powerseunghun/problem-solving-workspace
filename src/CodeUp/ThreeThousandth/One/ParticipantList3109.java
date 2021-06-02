package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ParticipantList3109 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, String> map = new HashMap<>();
		ArrayList<Integer> arr = null;
		String flag = null, data = null, tmp = null;
		String[] tArray = null;
		StringTokenizer st = null;
		int num = 0, find = 0;
		
		int n = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			flag = tmp.split(" ")[0];
			num = Integer.parseInt(tmp.split(" ")[1]);
			data = tmp.split(" ")[2];
			
			switch(flag) {
			case "I":
				if (!map.containsKey(num)) {
					map.put(num, data);
				}
				else map.put(num, data + " " + map.get(num));
				break;
			case "D":
				if (map.containsKey(num)) {
					tArray = map.get(num).split(" ");
					if (tArray.length == 1) {
						map.remove(num);
					}
					else if (tArray.length > 1) {
						String tName = "";
						for (int j = 1; j < tArray.length; j++) {
							tName += (tArray[j] + " ");
						}
						map.put(num, tName);
					}
				}
				break;
			}
			
		}
		st = new StringTokenizer(br.readLine());
		
		arr = new ArrayList<>(map.keySet());
		Collections.sort(arr);
		
		while (st.hasMoreTokens()) {
			find = Integer.parseInt(st.nextToken());
			tArray = map.get(arr.get(find-1)).split(" ");
			
			for (int i = 0; i < tArray.length; i++) {
				System.out.println(arr.get(find - 1) + " " + map.get(arr.get(find-1)));
			}
		}
	}
}
