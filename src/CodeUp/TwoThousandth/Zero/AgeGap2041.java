package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AgeGap2041 {
	static Map<String, Integer> init() {
		Map<String, Integer> map = new HashMap<>();
		map.put("January", 1); map.put("February", 2); map.put("March", 3);
		map.put("April", 4); map.put("May", 5); map.put("June", 6);
		map.put("July", 7); map.put("August", 8); map.put("September", 9);
		map.put("October", 10); map.put("November", 11); map.put("December", 12);
		
		return map;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<String> list = new ArrayList<>();
		Map<String, Integer> map = init();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null, reg = "s|t|n|d|r|h";
		
		int n = Integer.parseInt(br.readLine()), count = 0;
		for (int i = 0; i < n ; i++) {
			list.add(br.readLine());
		}
		
		for (int i = 1; i < list.size(); i++) {
			String cmpMonth = list.get(i-1).split(" ")[1];
			String month = list.get(i).split(" ")[1];
			
			if (map.get(cmpMonth) == map.get(month)) {
				String cmpDay = list.get(i-1).split(" ")[2].replaceAll(reg, "");
				String day = list.get(i).split(" ")[2].replaceAll(reg, "");
				if (Integer.parseInt(cmpDay) > Integer.parseInt(day)) count++;
			}
			else if (map.get(cmpMonth) > map.get(month)) count++;
		}
		if (count == 0) {
			System.out.println("No difference.");
			return;
		}
		System.out.print(list.get(0).split(" ")[0] + " is ");
		if (count == 1) {
			System.out.println(count + " year older than " 
					+ list.get(n-1).split(" ")[0] + ".");
		}
		else {
			System.out.println(count + " years older than " 
					+ list.get(n-1).split(" ")[0] + ".");
		}
	}
}
