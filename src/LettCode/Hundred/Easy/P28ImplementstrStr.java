package LettCode.Hundred.Easy;

public class P28ImplementstrStr {
    static int strStr(String haystack, String needle) {
    	return haystack.indexOf(needle);
    }
	public static void main(String[] args) {
		System.out.println(strStr("aaaaa", "bba"));
	}
}
