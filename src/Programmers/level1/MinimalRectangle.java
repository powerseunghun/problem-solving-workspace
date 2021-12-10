package Programmers.level1;

public class MinimalRectangle {
	static int solution(int[][] sizes) {
        int a = 0, b = 0;
        for (int i = 0; i < sizes.length; i++) {
        	a = Math.max(a, Math.max(sizes[i][0], sizes[i][1]));
        	b = Math.max(b, Math.min(sizes[i][0], sizes[i][1]));
        }
		
        return a*b;
    }
	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(solution(sizes));
	}
}
