package java0905;

public class Matrix {

	public static void main(String[] args) {
		//2행 3열 짜리 배열을 데이터를 대입한 상태에서 생성 
		String [][] korean = {
				{"김씨", "이씨", "조씨"}, 
				{"서씨", "탁씨", "환씨"}};
		//2차원 배열의 모든 데이터를 접근 
		//2개의 반복문을 이용 
		for(int row=0; row<2; row=row+1) {
			for(int col=0; col<3; col=col+1) {
				System.out.println(korean[row][col]);
			}
		}
		System.out.printf("======================\n");
		//위의 반복문을 하나의 반복문으로 처리 
		//행인덱스는 열의 개수일 때마다 변경 : 특정한 개수만큼 진행하는 작업은 몫을 이용 
		//열인덱스는 0부터 열인덱스 -1 까지를 순서대로 반복 
		//일정한 범위 내의 데이터를 순서대로 하도록 할 때는 나머지를 이용 
		for(int i=0; i<6; i=i+1) {
			System.out.println(korean[i/3][i%3]);
		}
		System.out.printf("======================\n");
		//이차원 배열을 빠른 열거를 이용해서 접근하는 경우 2번 해야 합니다 
		//한 번 할 때 마다 배열이 하나씩 벗겨집니다. 
		for(String [] imsi : korean){
			for(String temp : imsi) {
				System.out.printf("%s\n", temp);
			}
		}
	}
}
