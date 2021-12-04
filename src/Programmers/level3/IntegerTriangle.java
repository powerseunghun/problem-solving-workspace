package Programmers.level3;

public class IntegerTriangle {
	static int solution(int[][] triangle) {
        int answer = 0;
        for (int i = 1; i < triangle.length; i++) {
        	for (int j = 0; j < triangle[i].length; j++) {
        		System.out.println("i : " + i + ", j : " + j);
        		if (j == 0) {
        			triangle[i][j] += triangle[i-1][j];
        		}
        		else if (j == triangle[i].length-1) {
        			triangle[i][j] += triangle[i-1][j-1];
        		}
        		else {
        			triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
        		}
        		answer = Math.max(triangle[i][j], answer);
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		
		System.out.println(solution(triangle));
	}
}
