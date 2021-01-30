package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExtensionCheck {
	public static void main(String[] args) {
		Map<String, String> extension = new HashMap<>();
		extension.put(".dib", "Paint.Picture");
		extension.put(".doc", "Word.Document.8");
		extension.put(".docx", "Word.Document.12");
		extension.put(".htm", "htmfile");
		extension.put(".html", "htmlfile");
		extension.put(".hwp", "Hwp.Document.96");
		extension.put(".hwpx", "Hwp.Document.hwpx.96");
		extension.put(".hwt", "Hwp.Document.hwt.96");
		extension.put(".jpe", "jpegfile");
		extension.put(".jpeg", "jpegfile");
		extension.put(".jpg", "jpegfile");
		extension.put(".ppt", "PowerPoint.Show.8");
		extension.put(".pptx", "PowerPoint.Show.12");
		extension.put(".pptxml", "powerpointxmlfile");
		
		String s = new Scanner(System.in).nextLine();
		int idx = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '.') {
				idx = i;
				break;
			}
		}
		
		System.out.println(extension.get(s.substring(idx, s.length())));
		
	}
}
