package Programmers.level2;

public class NSqauredArrayCutting {
	static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        int idx = 0;
        
        for (long i = left, r = 0, c = 0; i <= right; i++) {
        	r = (long) (i / n);
        	c = i % n;
        	answer[idx++] = (int)(Math.max(r, c))+1;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int n = 3;
		long left = 2, right = 5;
		int[] ans = solution(n, left, right);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
