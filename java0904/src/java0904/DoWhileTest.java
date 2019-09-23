package java0904;

public class DoWhileTest {
	public static void main(String[] arg) {
		//601을 3번 출력 - do~while 이용
		int i = 0;
		do {
			System.out.printf("601\n");
			i = i + 1;
		}while(i<3);
		
		//1~10 까지의 합계 
		//1+2+3+4+ ... + 10
		int a = 1;
		//합계를 저장할 변수
		int sum = 0;
		do {
			//합을 구할 내용을 기존의 합계에 추가
			sum = sum + a;
			a = a+1;			
		}while(a<=10);
		System.out.printf("합계 : %d\n" , sum);
		
		//image1.png, image2.png, image3.png를 반복문을 이용해서 출력
		//1,2,3을 반복문을 이용해서 출력 -> image를 추가하고 .png을 뒤에 추
		int b = 0;
		do {
			b++;
			System.out.printf("image%d.png\t", b);
		}while(b<=2);
		System.out.printf("\n");
		b = 1;
		while(b<4) {
			System.out.printf("image%d.png\t", b);
			b = b+1;
		}
		
	}
}
