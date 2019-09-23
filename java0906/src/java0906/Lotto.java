package java0906;

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
				i=i-1;//무효화 하고 다시 1부터 45 사이의 숫자 입력받기 
				continue;
			}
			//이전에 입력한 데이터와 중복 검사
			//중복검사 통과 여부를 확인할 변수 
			int flag = 0;
			//데이터 중복 검사를 수행해서 동일한 데이터가 있으면 flag = 1
			for(int j=0; j<i; j=j+1) {
				if(lotto[i] == lotto[j]) {
					flag = 1;
				}
			}
			if(flag == 1)
			{
				System.out.printf("중복된 숫자입니다.!!!\n");
				i = i - 1; //무효화 하고 다시 1부터 45 사이의 숫자 입력받기 
			}
		}
		//데이터 정렬 - 선택 정렬 
		//n-1 회전 동안 자신의 뒤에 있는 모든 데이터와 비교해서 정렬
		for(int i =0; i<len-1; i=i+1) {
			for(int j=i+1; j<len; j=j+1) {
				//데이터를 비교해서 앞의 데이터가 더 크다면 swap
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		//데이터 출력
		for(int temp : lotto) {
			System.out.printf("%d\t", temp);
		}
		sc.close();
	}
}