package Programmers.level2;

public class MultiLCM {
	static int GCD(int a, int b) {
		if (b == 0)return a;
		else return GCD(b, a%b);
	}
	static int LCM(int a, int b) {
		return (a*b) / GCD(a, b);
	}
	static int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
        	answer = LCM(answer, arr[i]);
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		System.out.println(solution(arr));
	}
}
