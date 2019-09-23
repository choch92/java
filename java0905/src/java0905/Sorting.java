package java0905;

public class Sorting {

	public static void main(String[] args) {
		int [] ar = {80, 76, 99, 45, 72};
		//데이터의 개수 저장
		int len = ar.length;
		/*
		//선택정렬
		//데이터의 개수가 n이라면 n-1번 수행 
		for(int i=0; i<len-1; i=i+1) {
			//회전수 + 1 번째 부터 마지막 데이터 까지 비교 
			for(int j=i+1; j<len; j=j+1) {
				//앞의 데이터가 뒤의 데이터보다 크다면 swap
				//내림차순을 하고 싶으면 if(ar[i] < ar[j]) { 로 등호만 바꾸어주면됨. 
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		//데이터 출력 
		for(int temp : ar) {
			System.out.printf("%d\t", temp);
		}
		*/
		//Bubble 정렬 
		//최대 n-1 회전, 0 - 3
		for(int i=0; i<len-1; i=i+1) {
			//데이터 교체가 있었는지 확인할 변수 
			int flag = 0;
			//첫번째부터 마지막 데이터 이전까지 
			for(int j=0; j<len-1-i; j=j+1) {
				//자신의 뒤의 데이터와 비교해서 정렬 
				if(ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					//데이터 교체가 있었다는 것을 표시 
					flag = 1;
				}
			}
			//1회전 동안 데이터 교체가 없었으면 비교 종료 
			if(flag==0) {
				break;
			}
		}
		//데이터 출력 
		for(int temp : ar) {
			System.out.printf("%d\t", temp);
		}
	}

}
