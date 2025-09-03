package Acmicpc.As.B3.TwentyThousandth.Nine.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Фомаизанимательнаяматематика29133 {
	public static void main(String[] args) throws IOException {
		List<Integer> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int c = Integer.parseInt(str.split(" ")[2]);
		int d = Integer.parseInt(str.split(" ")[3]);
		
		for (int i = 1; i <= 3; i++) {
			if (Math.pow(a, i)+Math.pow(b, i)+Math.pow(c, i) == d) {
				list.add(i);
			}
		}
		
		System.out.println(list.size() == 1 ? list.get(0) : -1);
		br.close();
 	}
}
