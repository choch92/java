package format;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataFormatMain {

	public static void main(String[] args) {
		// java 안에서 날짜를 만들 때는 Calendar 클래스를 이용해서 날짜를 만든 후 
		// Date 클래스의 객체로 변환
		// 1992년 1월 27일 Date 객체로 만들기
		Calendar cal = new GregorianCalendar(1992, 0, 27, 11, 00, 00);
		Date date = new Date(cal.getTimeInMillis());
		
		/** java.text.SimpleDateFormat **/
		// 원하는 포맷의 문자열로 만들기
		// 년도 4자리 월 2자리 일 2자리 오전 오후 시간 분 초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd EEE a hh mm ss");
		String result = sdf.format(date);
		System.out.printf("%s\n", result);
		
		/** java.text.DecimalFormat **/
		DecimalFormat df = new DecimalFormat("\u00A4 0,000.0");
		double n = 1898.99;
		String r = df.format(n);
		System.out.printf("%s\n", r);
		
		/** java.text.ChoiceFormat **/
		double [] scores = {0,60,70,80,90};
		String [] grades = {"F", "D", "C", "B", "A"};
		// if 나 switch를 이용해서 가능, if 나 switch의 코드 양을 줄일 수 있음
		ChoiceFormat cf = new ChoiceFormat(scores, grades);
		r = cf.format(87);
		System.out.printf("%s\n", r);
		
		/** java.text.MessageFormat **/
		r = "이름:{0} 전화번호{1}";
		Object [] person = {"조창훈", "01054576063"};
		// String 클래스의 format 메소드를 이용해서도 동일한 결과를 만들어 낼 수 있음
		// result = String.format("이름:%s 전화번호:%s", "박문석", "01054576063");
		result = MessageFormat.format(r, person);
		System.out.printf("%s\n", r);
		
	}

}
