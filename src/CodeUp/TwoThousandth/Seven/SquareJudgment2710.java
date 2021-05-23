package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SquareJudgment2710 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> points = new ArrayList<>();
		int minX = 0, maxX = 0, minY = 0, maxY = 0, tX = 0, tY = 0;
		String tmp = null;
		for (int i = 0; i < 4; i++) {
			tmp = br.readLine();
			tX = Integer.parseInt(tmp.split(" ")[0]);
			tY = Integer.parseInt(tmp.split(" ")[1]);
			minX = tX <= minX ? tX : minX;
			maxX = tX >= maxX ? tX : maxX;
			minY = tY <= minY ? tY : minY;
			maxY = tY >= maxY ? tY : maxY;
			points.add(tmp);
		}
		
		for (int i = 0; i < points.size(); i++) {
			tX = Integer.parseInt(points.get(i).split(" ")[0]);
			tY = Integer.parseInt(points.get(i).split(" ")[1]);
			if ((tX > minX && tX < maxX) && (tY > minY && tY < maxY)) {
				System.out.println("0");
				return;
			}
		}
		System.out.println("1");
	}
}
