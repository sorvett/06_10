package lesson15;

public class Main15_06_01 {
	public static boolean isValidPlayerName(String name) {
		//文字数のチェック
		String s = "Javaa";
		boolean b1 = s.matches("Java");			//mainから呼んでいるから
		boolean b2 = s.matches("JavaJava");
		boolean b3 = s.matches("j.va");
		boolean b4 =s.matches("Java.*");
		
		System.out.println(b1);
		System.out.println(b4);
		return name.matches("[A-Z] [A-Z0-9]{7}");
	}
	public static void main(String[] args) {
		String pName1 = "MINATO";		//NG
		String pName2 = "1MINATO12";	//NG
		String pName3 = "MINATO1@";		//NG
		String pName4 = "MINATO12";		//OK
		
		if (isValidPlayerName(pName1) == false) {
			System.out.println(pName1 + "は間違い");
		}
		
		if (isValidPlayerName(pName2) == false) {
		System.out.println(pName2 + "は間違い");
		}
				
		if (isValidPlayerName(pName3) == false) {
		System.out.println(pName3 + "は間違い");
		}
		
		if (isValidPlayerName(pName4)) {
		System.out.println(pName4 + "は正しい名前です");
		}


	}

}
