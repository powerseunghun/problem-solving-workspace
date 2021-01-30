package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeSNS4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		String name = "";
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		name = sc.next();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).split(",")[0].equals(name)) {
				System.out.println(list.get(i).split(",")[2]);
				break;
			}
		}
	}
}
