package lesson15;

public class Main15_07 {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		for (String w : words) {
			System.out.print(w + "->");
		}

	}

}
