package lang;

public class StringMain4 {

	public static void main(String[] args) {
		int [] ar = {100, 78, 89, 65, 45};
		// 선택정렬
		// 숫자 데이터는 크기 비교를 >, <, == 등으로 합니다.
		int len = ar.length;
		for(int i = 0; i < len - 1; i = i + 1) {
			for(int j = i + 1; j < len; j = j + 1) {
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int temp : ar) {
			System.out.printf("%d\t", temp);
		}
		// 위의 알고리즘을 이용해서 문자열의 정렬
		String [] names = {"조창훈", "류혜림", "조성우", "최진용", "연제민", "김주안", "김수윤"};
		// 한글이 어떤 자음으로 시작하는지 판단할 때는 모음의 시작은 ㅏ 이고 끝은 ㅣ
		// 받침의 시작은 없는 것이고 마지막은 ㅎ 입니다.
		// 한글은 "가"에서 시작해서 "힣"이 끝입니다.
		// ㄱ으로 시작하는 경우는 가보다 크거나 같고 나보다 작은 경우입니다.
		if(names[0].compareTo("가")>=0 && names[0].compareTo("나")<0) {
			System.out.printf("\nㄱ 으로 시작\n");
		}else {
			System.out.printf("\nㄱ 으로 시작하지 않습니다.\n");
		}
		// 위의 문자열을 정렬 : 크기 비교는 compareTo 메소드 이용
		// String compareTo(String other() 메소드는 ()안에 있는 데이터가 크면 음수(-1) 같으면 0
		// 작으면 양수(1)를 리턴합니다.				
		int len1 = names.length;
		for(int i = 0; i < len1-1; i = i +1) {
			for(int j = i+1; j<len1; j = j +1) {
				if(names[i].compareTo(names[j]) > 0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		// 데이터 출력 - ㄱ ㄴ ㄷ ㄹ... 순서대로 되야함
		for(String temp : names) {
			System.out.printf("%s\t", temp);
		}
	}
}
