package java0905;

public class PrimeCheck {

	public static void main(String[] args) {
		// 2부터 1000까지 소수의 개수 세기
		// 소수 : 2부터 자신의 절반이 숫자까지 나누어서 한번도 나누어떨어지지 않는 숫자
		// 2부터 1000까지 반복

		// 데이터 개수를 저장할 변수
		int cnt = 0;
		for (int i = 2; i <= 1000; i = i + 1) {
			// 소수 판별을 위한 변수
			int flag = 0;
			// 소수 판별
			for (int j = 2; j <= i / 2; j = j + 1) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			// 소수 라면 cnt값을 1증가
			if (flag == 0) {
				cnt = cnt + 1;
			}
		}
		System.out.printf("소수 개수 : %d\n", cnt);
	}
}
