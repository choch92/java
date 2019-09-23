package java0904;

public class ForTest {
	public static void main(String[] arg) {
		//Hello Java를 3번 출력 - for 이용
		//for(처음수행되는식; false가 나오면 반복문을 중단하는 식; 두번째부터 수행되는 ){반복할 내용}
		//while은 반복조건을 하나씩 세로로 작성하지만, for는 가로로 하나의 행에 작성
		for(int i=0; i<3; i = i + 1){System.out.printf("Hello Java \n");}
		
		//1부터 10까지의 짝수 합계 - for 이용
		int sum = 0;
		for(int a=1; a<=5; a=a+1) {sum = sum + a*2;}
		System.out.printf("합계 : %d\n", sum);
		//for를 이용한 무한 반복
		//두번째 부분이 false가 될 때 까지 수행하기 때문에 두번째 부분이 생략되면 무한 반복 
		for(int i = 1; ; i=i+1) {System.out.printf("Hi\n");}
	}
}
