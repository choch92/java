package java0903;

public class OpTest {

	public static void main(String[] args) {
		//다음 2개의 변수 중에서 작은 값을 min에 저장하고 출력하기 
		int a = 20, b= 30;
		int min = a < b ? a : b;
		System.out.printf("작은 값: %d\n", min);
		
		int time = 7700;
		//내 방법
		//time에 전체 시간이 초단위로 저장되어 있습니다.
		//time은 몇 시간 몇 분 몇 초 인지 계산
		int hour = (time/60)/60;
		int minute = (time/60)%60;
		int second = time%60;
		System.out.printf("7700초 : %d시간 %d분 %d초 입니다.\n", hour, minute, second);
		
		//선생님 방법
		//시간 구하기 
		int thhour = time / 3600;
		//분 구하기 : 전체 시간에서 시간이 가져간 부분을 제외하고 60으로 나누기
		int thminute = (time - hour*3600)/60;
		//초 구하기 : 전체 시간에서 시간과 분이 가져간 부분을 제외 
		int thsecond = time % 60;
		System.out.printf("선생님의 방법 "
				+ "7700초 : %d시간 %d분 %d초 입니다.\n", thhour, thminute, thsecond);
		
		int money = 760000;
		//오만원 몇장 만원 몇장을 주는 것이 최소로 줄 것인지 계산
		int c = 760000/50000;
		int d = (money - c*50000)/10000;
		System.out.printf("760000원 : %d개의 오만원 %d개의 만원 입니다.\n", c, d);
	}}
