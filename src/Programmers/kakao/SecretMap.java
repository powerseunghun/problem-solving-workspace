package Programmers.kakao;

public class SecretMap {
	public String getBinary(int n, int f) {
		String s = "";
		while(n != 0) {
			s += (n % 2);
			n /= 2;
		}
		if (s.length() < f) {
			for (int i = s.length(); i < f; i++) {
				s += "0";
			}
		}
		return new StringBuffer(s).reverse().toString(); 
	}
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String tmp = "";
        for (int i = 0; i < n; i++) {
        	tmp = this.getBinary((arr1[i] | arr2[i]), n);
        	answer[i] = "";
        	for (int j = 0; j < n; j++) {
        		if (tmp.charAt(j) == '0') {
        			answer[i] += " ";
        		} 
        		else answer[i] += "#";
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
	}
}
