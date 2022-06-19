package lesson15;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main15_15 {
	public static void main(String[] args) {
		//LocalDateTimeの生成方法
		LocalDateTime l1 = LocalDateTime.now();	//現在の時刻
		System.out.println(l1);
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);	//日時の設定
		System.out.println(l2);
		
		//LocalDateTimeとZonedDateTimeの相互変換
		//z1はロンドン時間2020/01/01 09:05:00
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		System.out.println(z1);
		 LocalDateTime l3 = z1.toLocalDateTime();
		 System.out.println(l3);
		 System.out.println(l3.getYear());
		 System.out.println(l3.getMonth()); 
		 

	}

}
