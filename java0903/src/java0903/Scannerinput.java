package java0903;
import java.util.Scanner;
public class Scannerinput {

	public static void main(String[] args) {
		//키보드로부터 입력받을 수 있는 스캐너 생성 
		Scanner sc = new Scanner(System.in);
		//이름을 문자열로 입력받기
		System.out.printf("이름을 입력하세요:");
		String name = sc.nextLine();
		System.out.printf("이름:%s\n", name);
		//나이를 정수로 입력받기
		System.out.printf("나이를 입력하세요:");
		int age = sc.nextInt();
		System.out.printf("나이:%s\n", age);
		
		System.out.printf("점수를 입력하세요:");
		int score = sc.nextInt();
		//Score가 60이상이면 합격이라고 출력 그렇지 않으면 불합격이라고 출
		if(score >= 60) {System.out.printf("합격\n");}
		else {System.out.printf("불합격\n");}
		sc.close();
	}}
