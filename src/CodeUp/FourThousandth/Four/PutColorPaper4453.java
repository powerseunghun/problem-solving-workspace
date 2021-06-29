package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Paper {
	private int width;
	private int height;
	
	public Paper() {
		this.width = 0;
		this.height = 0;
	}
	
	public Paper(int w, int h) {
		this.width = w;
		this.height = h;
	}
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int w) {
		this.width = w;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int h) {
		this.height = h;
	}
	public int getArea() {
		return width * height;
	}
}
public class PutColorPaper4453 {
	static int dp(int idx, int n, Paper[] papers, int[] mem) {
		int maxCount = 0;
		if (idx == n+1) return 0;
		if (mem[idx] != 0) return mem[idx];
		
		for (int i = idx+1; i <= n+1; i++) {
			if (i == n+1) {
				maxCount = Math.max(maxCount, dp(i, n, papers, mem)+1);
			}
			else if (check(papers[idx], papers[i])) {
				maxCount = Math.max(maxCount, dp(i, n, papers, mem)+1);
			}
		}
		return maxCount;
	}
	static boolean check(Paper top, Paper checkPaper) {
		if (top.getWidth() >= checkPaper.getWidth() && top.getHeight() >= checkPaper.getHeight()) {
			return true;
		}
		if (top.getWidth() >= checkPaper.getHeight() && top.getHeight() >= checkPaper.getWidth()) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = Integer.parseInt(br.readLine());
		Paper[] papers = new Paper[n+1];
		int[] mem = new int[n+1];
		
		papers[0] = new Paper(1001, 1001);
		for (int i = 1, w = 0, h = 0; i <= n; i++) {
			tmp = br.readLine();
			w = Integer.parseInt(tmp.split(" ")[0]);
			h = Integer.parseInt(tmp.split(" ")[1]);
			papers[i] = new Paper(w, h);
		}
		Arrays.sort(papers, new Comparator<Paper>() {
			@Override
			public int compare(Paper o1, Paper o2) {
				return o2.getArea()-o1.getArea();
			}
		});
//		for (int i = 1; i < papers.length; i++) {
//			if (check(top, papers[i])) {
//				System.out.println(papers[i].getWidth() + ", " + papers[i].getHeight() + " : " + papers[i].getArea());
//				count++;
//				top.setWidth(papers[i].getWidth());
//				top.setHeight(papers[i].getHeight());
//			}
//		}
		
//		for (int i = 0; i < papers.length; i++) {
//			System.out.println(papers[i].getWidth() + ", " + papers[i].getHeight() + " : " + papers[i].getArea());
//		}
		System.out.println(dp(0, n, papers, mem)-1);
	}
}
