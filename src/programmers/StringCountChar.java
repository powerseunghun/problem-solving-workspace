package programmers;

public class StringCountChar {
	boolean solution(String s) {
        boolean answer = true;

        int countp = 0, county = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') countp++;
            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') county++;
        }
        
        answer = countp == county ? true : false;
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(new StringCountChar().solution("Pyy"));
	}
}
