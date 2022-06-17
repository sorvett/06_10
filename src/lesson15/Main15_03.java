package lesson15;

public class Main15_03 {

	public static void main(String[] args) {
		//開始位置を指定して文字を切り出す
		String s1 = "Java programing";
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
		
		//開始、終了位置を指定して文字を切り出す
		String s2 = "japan,america,russia";
		System.out.println("文字列s2の6~12文字目は" + s2.substring(6, 13));
	}

}
