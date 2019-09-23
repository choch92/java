package java0903;

import java.util.Scanner;

public class LoginTest {
	public static void main(String[] args) {
		//아이디와 비밀번호를 입력받는 문
		Scanner sc = new Scanner(System.in);
		//아이디를 입력받기 
		System.out.printf("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.printf("비밀번호를 입력하세요:");
		String pw = sc.nextLine();
		//id가 root이고 pw가 1234 이면 로그인 성공이라고 출력하고 그렇지 않으면 로그인 실패라고 출력하기
		if(id.equals("root") && pw.equals("1234")) {System.out.printf("로그인 성공\n");}
		else {System.out.printf("로그인 실패\n");}
		
		//년도를 입력받아서 윤년이면 2월은 29일이라고 출력하고 윤년이 아니면 2월은 28일 이라고 출
		//윤년의 조건
		//4의 배수이고 100의 배수는 아닌 경우 또는 400의 배수인 경우 
		System.out.printf("년도를 입력하세요:");
		int year = sc.nextInt();
		if((year%4 == 0) && (year%100!=0) || (year%400 ==0)){
			System.out.printf("입력하신 년도의 2월은 29일 입니다.\n");
		}else {
			System.out.printf("입력하신 년도의 2월은 28일 입니다.\n");
		}
		sc.close();}}
