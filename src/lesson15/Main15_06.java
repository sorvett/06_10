package lesson15;

public class Main15_06 {
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z0-9]{7}");
	}

	public static void main(String[] args) {
		String str = "東京都千代田区 123-4567";
		System.out.println(str.matches(".*[0-9]{3}-[0-9]{4}.*"));	
		System.out.println(str.matches("[0-9]{3}-[0-9]{4}"));
		//正規表現のパターンの前後に「任意の文字がいくつかある」という意味の「.*」を追加して完全一致させることで”true”を返している。
		
		System.out.println(isValidPlayerName("MINATO1"));

	}

}	