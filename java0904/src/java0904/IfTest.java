package java0904;

import java.util.Scanner;
public class IfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("점수를 입력하세요:");
		int score = sc.nextInt();
		sc.nextLine();
		//점수를 입력받아서 90-100 사이면 A, 80-89이면 B, 70-79이면 C, 60-69이면 D, 0-59이면 F
		//0-100 사이가 아니면 잘못된 점수 입력
		if(score>=90 && score<=100) {System.out.printf("당신의 등급은 : %s\n", "A");}
		else if(score>=80 && score<=89) {System.out.printf("당신의 등급은 : %s\n", "B");}
		else if(score>=70 && score<=79) {System.out.printf("당신의 등급은 : %s\n", "C");}
		else if(score>=60 && score<=69) {System.out.printf("당신의 등급은 : %s\n", "D");}
		else if(score>=0 && score<=59) {System.out.printf("당신의 등급은 : %s\n", "F");}
		else {System.out.printf("잘못된 입력입니다.");}
		
	
		//아이디와 비밀번호를 입력받아서 아이디가 root이고 비밀번호가 1234이면 로그인 성공이라고 출력
		//아이디 root인데 비밀번호가 1234가 아니면 비밀번호가 틀렸습니다 라고 출력
		//그이외의 경우는 없는 아이디입니다 라고 출력
		//1.아이디와 비밀번호 입력받기
		System.out.printf("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.printf("비밀번호를 입력하세요:");
		String pw = sc.nextLine();
		//2.조건 처리
		if(id.equals("root") && pw.equals("1234")) {System.out.printf("로그인 성공\n");}
		else if(id.equals("root") && !pw.equals("1234")) {System.out.printf("비밀번호가 틀렸습니다\n");}
		//else if(id.equals("root") && pw.equals("1234")==false) {System.out.printf("비밀번호가 틀렸습니다\n");}
		//else if(id.equals("root")) {System.out.printf("비밀번호가 틀렸습니다\n");}
		else {System.out.printf("그 이외의 경우는 없는 아이디입니다.");}
		
	sc.close();

	}

}
