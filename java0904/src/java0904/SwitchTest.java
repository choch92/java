package java0904;

import java.util.Scanner;
public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("메뉴 선택(1.중국집 2.분식집 3.한식집) :");
		String place = sc.nextLine();
		//문자열을 입력받아서 식당을 출력하기 - switch 사용
		//1.중국집 2.분식집 3.한식집 나머지는 잘못된 선택
		final String 중국집 = "1";
		final String 분식집 = "2";
		final String 한식집 = "3";
		switch(place) {
		case 중국집 : System.out.printf("중국집\n"); break;
		case 분식집 : System.out.printf("분식집\n"); break;
		case 한식집 : System.out.printf("한식집\n"); break;
		default : System.out.printf("잘못된 선택입니다.\n"); break;	
		}sc.close();
	}
}