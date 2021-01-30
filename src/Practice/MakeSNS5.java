package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeSNS5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		String name = "";
		String[] stds = null;
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		name = sc.next();
		
		for (int i = 0; i < list.size(); i++) {
			stds = list.get(i).split(",");
			if (stds[0].equals(name)) {
				for (int j = 3; j < stds.length; j++) {
					System.out.println(stds[j]);
				}
			}
		}
	}
}
