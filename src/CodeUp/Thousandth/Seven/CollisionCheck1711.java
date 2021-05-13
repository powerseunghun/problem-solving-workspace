package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CollisionCheck1711 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int x1 = Integer.parseInt(tmp.split(" ")[0]);
		int y1 = Integer.parseInt(tmp.split(" ")[1]);
		
		tmp = br.readLine();
		int x2 = Integer.parseInt(tmp.split(" ")[0]);
		int y2 = Integer.parseInt(tmp.split(" ")[1]);
		
		tmp = br.readLine();
		int x3 = Integer.parseInt(tmp.split(" ")[0]);
		int y3 = Integer.parseInt(tmp.split(" ")[1]);
		
		if ((x3 >= x1 && x3 <= x2) && (y3 >= y1 && y3 <= y2)) {
			System.out.println("충돌");
		}
		else System.out.println("비충돌");
	}
}
