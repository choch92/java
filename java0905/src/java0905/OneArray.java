package java0905;

public class OneArray {

	public static void main(String[] args) {
		//데이터를 처음부터 가지고 배열을 생성
		//데이터 1개의 자료형 [] 이름 = {데이터나열};
		int [] ar = {30, 20, 40, 50};
		
		//배열의 데이터 개수를 확인 
		//배열의 데이터 개수는 length 속성을 이용 
		System.out.printf("ar의 데이터 갯수 : %d\n", ar.length);
		
		//배열의 두번째 요소를 출력 
		//배열을 가지고 요소를 찾을 때는 [인덱스]
		//인덱스는 0~length-1
		System.out.printf("ar의 2번째 데이터 : %d\n", ar[1]);
		
		//br이라는 배열이름을 생성한 것입니다.
		//=을 한적이 없기 때문에 실제 데이터는 소유하고 있지 않습니다.
		//이런 경우에 .을 속성을 호출하면 에러(실행 안됨)는 아니고 예외(실행은 되는데 문제 발생)가 발생
		//단언(강제로 예외를 발생시키는 것)
		//NullPointerException : 참조형이 가리키는 데이터가 없어서 발생 
		int [] br = new int[4];	//4개를 저장할 수 있는 배열을 생성 
		System.out.printf("br의 데이터 갯수 : %d\n", br.length);
		//데이터가 4개인데 4번에 접근하면 잘못된 인덱스 
		//ArrayIndexOutOfBoundsException 발생 
		//System.out.printf("br[4]의 데이터 갯수 : %d\n", br[4]);
	}

}
