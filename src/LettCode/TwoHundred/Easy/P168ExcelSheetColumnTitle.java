package LettCode.TwoHundred.Easy;

public class P168ExcelSheetColumnTitle {
    static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber != 0) {
            if (columnNumber % 26 == 0) {
                sb.append('Z');
                columnNumber /= 26;
                columnNumber -= 1;
            }
            else {
                sb.append((char)(columnNumber%26-1+'A'));
                columnNumber /= 26;
            }
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
		
	}
}
