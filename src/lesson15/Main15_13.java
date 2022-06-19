package lesson15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main15_13 {
	public static void main(String[] args) throws Exception{
		SimpleDateFormat f = 
				new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		//文字列からDateインスタンスを生成
		//String型の日付をDate型に変換するには、SimpleDateFormatクラスのparseメソッドを使用
		Date d = f.parse("2020/09/22 01:23:45");
		System.out.println(d);
		
		//Dateインスタンスから文字列を生成
		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は" + s + "です");

	}

}
