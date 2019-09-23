package java0904;

import java.util.Scanner;

public class ValidationCheck {

	public static void main(String[] args) {
		// 1,2,3 이외의 문자열을 입력하면 다시 입력하도록 하고
		// 1,2,3 을 입력하면 정상 입력이라고 출력하고 종료
		Scanner sc = new Scanner(System.in);
		
		while (true) {	
			System.out.printf("메뉴를 입력하세요:");
			String menu = sc.nextLine();
			if (!menu.equals("1") && !menu.equals("2") && !menu.equals("3")) {
				System.out.printf("메뉴는 1 또는 2 또는 3으로 입력하세요.\n");
			} else {
				System.out.printf("정상입력 \n");
				break;
			}
		}
				
		//Scanner는 닫히면 다시 사용할 수 없고 새로 만들어서 사용해야 합니다.
		//0-100까지의 정수를 입력할 때 까지 입력받기
		while(true) {
			System.out.printf("정수를 입력하세요:");
			int number = sc.nextInt();
			if(number >= 0 || number <= 100) {
				System.out.printf("%d는 올바른 점수입니다.\n", number);
				break;
			}else {
				System.out.printf("0부터 100까지의 정수를 입력하세요.\n");
			}			
		}
		sc.close();
	}
}
