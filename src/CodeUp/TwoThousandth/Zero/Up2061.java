package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Up2061 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char house = br.readLine().charAt(0);
		int floor = house == 'A' ? 10 : house == 'S' ? 2 : 1;
		int t = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		String tmp = br.readLine();
		int m = Integer.parseInt(tmp.split(" ")[0]);
		int c = Integer.parseInt(tmp.split(" ")[1]);
		int w = Integer.parseInt(br.readLine()), ballon = 0;
		
		ballon = ((x * floor) / w) + 1 + t;
		if (ballon * c <= m) System.out.println("Yes");
		else System.out.println("No");
	}
}
