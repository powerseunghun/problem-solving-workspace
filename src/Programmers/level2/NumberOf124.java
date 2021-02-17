package Programmers.level2;

public class NumberOf124 {
	public String solution(int n) {
        String answer = "";
        while (n != 0) {
        	String tmp = "";
        	switch(n % 3) {
        	case 0:
        		tmp = "4";
        		break;
        	case 1:
        		tmp = "1";
        		break;
        	case 2:
        		tmp = "2";
        		break;
        	}
        	answer += tmp;
        	n = n % 3 == 0 ? n / 3 - 1: n / 3;
        }
        return new StringBuffer(answer).reverse().toString();
    }
	public static void main(String[] args) {
		System.out.println(new NumberOf124().solution(9));
	}
}
