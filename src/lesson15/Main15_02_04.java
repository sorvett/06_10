package lesson15;

public class Main15_02_04 {

	public static void main(String[] args) {
		// toUpperCaseメソッドで小文字を大文字に変換
		String s1 = "japan";
		System.out.println(s1.toUpperCase());
		
		//toLowerCaseメソッドで大文字を小文字に変換
		String s2 = "Japan,AMERICA";
		System.out.println(s2.toLowerCase());
		
		//toLowerCaseメソッドで大文字を小文字に変換
		String s3 = "america";
		s3 = s3.substring(0,1).toUpperCase() +  s3.substring(1).toLowerCase();
		System.out.println(s3);
		
		
		String s4 = "Java programing    ";
	    System.out.println("削除前 = " + s4 + "");
	    System.out.println("削除後 = " + s4.trim() + "");
	    
	    String s5 = "Jxvx";
	    System.out.println(s5.replace("x", "a"));
	}

}
