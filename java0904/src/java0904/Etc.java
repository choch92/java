package java0904;

public class Etc {

	public static void main(String[] args) {
		// 1부터 10까지 출력
		for (int i = 1; i <= 10; i = i + 1) {
			// i가 3의 배수라면
			// break이면 반복문을 중단하므로 1, 2만 나옴
			// continue는 다음 반복으로 넘어갑니다.
			if (i % 3 == 0) {
				//break;
				continue;
			}
			System.out.printf("i : %d\n", i);
		}
	}
}
