package java0917;
import java.util.Arrays;
public class ArraysMain1 {
	public static void main(String[] args) {
		String [] names = {"조창훈", "류혜림", "조성우", "최진용", "연제민", "김주안", "김수윤"};
		// 배열의 데이터를 정렬해주는 메소드
		// Arrays.sort - String 클래스는 Comparable을 implements 했으므로 정렬 가능 
		Arrays.sort(names);
		// 정렬이 되었는지 확인
		for(String name : names) {
			System.out.printf("%s\t", name);
		}
		// 정수 배열도 정렬이 가능
		// 정수는 int 이지만 Arrays가 볼 때는 Integer 입니다.
		int [] ar = {100, 200, 78, 76, 12, 18, 28};
		// 정렬을 하지 않은 상태에서 binary search 수행
		// binary search는 정렬이 안된 상태에서 하면 올바른 결과를 가져오지 못합니다.
		int result = Arrays.binarySearch(ar, 18);
		System.out.printf("\nresult : %d\n", result);
		// 먼저 정렬을 수행하고 binary search를 수행 
		// 12, 18, 28, 76, 78, 100, 200
		Arrays.sort(ar);
		result = Arrays.binarySearch(ar, 18);
		System.out.printf("result : %d\n", result);	
	}
}
