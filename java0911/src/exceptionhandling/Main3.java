package exceptionhandling;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args){
		while (true) {
			// 1부터 10까지 출력하기
			for (int i = 1; i <= 10; i = i + 1) {
				System.out.printf("i : %d\t", i);
				// 1초씩 대기
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.printf("인터럽트 예외 발생\n");
					System.out.printf("예외 : %s\n", e.getMessage());
					e.printStackTrace();
				}
			}
			System.out.printf("\n");
			
			//Scanner를 사용하는 경우 close()를 호출하지 않으면
			//메모리 누수(leak)가 발생한다고 경고가 보입니다.
			//이렇게 try안에서 만들면 자동으로 마지막에 close()를 호출하므로 경고가 발생안함
			try(Scanner sc = new Scanner(System.in);){
				sc.hasNextInt();
			}
		}
	}
}
