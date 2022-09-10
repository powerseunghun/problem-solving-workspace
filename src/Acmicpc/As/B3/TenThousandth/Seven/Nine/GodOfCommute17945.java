package Acmicpc.As.B3.TenThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GodOfCommute17945 {
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = 1;
		int b = 2 * Integer.parseInt(tmp.split(" ")[0]);
		int c = Integer.parseInt(tmp.split(" ")[1]);
		int D = (int) ((Math.pow(b, 2) - (4 * a * c)));
		int res1 = (int)(((-1 * b) + Math.sqrt(D)) / 2 * a);
		int res2 = (int)(((-1 * b) - Math.sqrt(D)) / 2 * a);
		
		list.add(res1);
		if (D > 0) list.add(res2);
		Collections.sort(list);
		
		System.out.println(D == 0 ? list.get(0) : list.get(0) + " " + list.get(1));
		br.close();
	}
}
