package timer;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

// 타이머 작업을 위한 클래스
class TimerTaskEx extends TimerTask{
	// 타이머로 동작할 작업
	public void run() {
		System.out.printf("오늘 점심은 뭐먹을까?\n");
	}
}
public class TimerMain {

	public static void main(String[] args) {
		// Date 만들기
		Calendar cal = new GregorianCalendar(2019, 8, 20, 11, 14, 0);
		Date date = new Date(cal.getTimeInMillis());
		// Timer 만들기
		Timer timer = new Timer();
		// 2019년 09월 20일 11시 14분에 동작하도록 설정
		//timer.schedule(new TimerTaskEx(), date);
		
		// void schedule(TimerTask task, long delay, long period)
		// delay 후 에 task를 수행하는데 period를 주기로 해서 계속 수행
		// 1초 후부터 10초마다 작업을 수행
		timer.schedule(new TimerTaskEx(), 1000, 10000);
		
	}

}
