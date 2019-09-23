package java0905;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		//정수 6개를 저장할 수 있는 배열을 생성해서
		//1-45까지의 숫자를 중복되지 않게 입력하는 프로그램을 작성
		
		Scanner sc = new Scanner(System.in);
		
		//정수 6개를 저장할 수 있는 배열 만들기 
		int [] lotto = new int[6];
		//일반적인 for 구문을 이용해서 lotto 배열의 데이터 순회하기 
		int len = lotto.length;
		for(int i=0; i<len; i=i+1) {
			System.out.printf("숫자를 입력해주세요(1-45 사이):");
			lotto[i] = sc.nextInt();
			
			//1부터 45 사이의 숫자가 아니면 다시 입력받기
			if(lotto[i] <1 || lotto[i]>45) {
				System.out.printf("1-45사이의 숫자를 입력하세요!!!\n");
				i=i-1;
				continue;
			}
		}
		//데이터 출력
		for(int temp : lotto) {
			System.out.printf("%d\t", temp);
		}
		sc.close();
	}
}
