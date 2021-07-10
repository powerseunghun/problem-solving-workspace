package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Point {
	private int loc;
	private int color;
	
	public Point() {
		this.loc = 0;
		this.color = 0;
	}
	public Point(int l, int c) {
		this.loc = l;
		this.color = c;
	}
	public int getLoc() {
		return this.loc;
	}
	public void setLoc(int l) {
		this.loc = l;
	}
	public int getColor() {
		return this.color;
	}
	public void setColor(int c) {
		this.color = c;
	}
}
public class Arrow4892 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		ArrayList<Integer> colorList = new ArrayList<>();
		int N = Integer.parseInt(br.readLine()), loc = 0, color = 0, sum = 0;
		Point[] points = new Point[N];
		
		for (int i = 0; i < points.length; i++) {
			tmp = br.readLine();
			loc = Integer.parseInt(tmp.split(" ")[0]);
			color = Integer.parseInt(tmp.split(" ")[1]);
			points[i] = new Point(loc, color);
		}
		Arrays.sort(points, new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return o1.getLoc() - o2.getLoc();
			}
		});
		
		for (int i = 0; i < points.length; i++) {
			if (!map.containsKey(points[i].getColor())) {
				ArrayList<Integer> tList = new ArrayList<>();
				tList.add(points[i].getLoc());
				colorList.add(points[i].getColor());
				map.put(points[i].getColor(), tList);
			}
			else {
				ArrayList<Integer> tList = map.get(points[i].getColor());
				tList.add(points[i].getLoc());
				map.put(points[i].getColor(), tList);
			}
		}
		for (int i = 0; i < colorList.size(); i++) {
			ArrayList<Integer> tList = map.get(colorList.get(i));
			if (tList.size() == 1) continue;
			for (int j = 0; j < tList.size(); j++) {
				int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
				if (j != 0) {
					a = tList.get(j)-tList.get(j-1);
				}
				if (j != tList.size() -1) {
					b = tList.get(j+1) - tList.get(j);
				}
				sum += Math.min(a, b);
			}
		}
		System.out.println(sum);
	}
}
