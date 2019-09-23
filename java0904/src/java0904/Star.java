package java0904;

public class Star {
	public static void main(String[] args) {
	/*
		 0*****	0-4
		 1***** 0-4
		 2***** 0-4
		 3***** 0-4
		 4***** 0-4
	*/
		
		for(int i=0; i<5; i=i+1) {
			for(int j=0; j<5; j=j+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.printf("==============\n");
	
	/*
	 0*		0-0 끝나는 숫자가 변화(1씩 증가) : 1*i
	 1**	0-1
	 2***	0-2
	 3****	0-3
	 4*****	0-4
	 */
		for(int a=0; a<5; a=a+1) {
			for(int b=0; b<a+1; b=b+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.printf("==============\n");
		
	/*
		0*****	0-4 끝나는 숫자가 변화(-1씩 감소) : -1 * i + 4 : 4 - i	 
		1**** 	0-3
		2*** 	0-2
		3** 	0-1
		4* 		0-0
	*/
		for(int c=0; c<5; c=c+1) {
			for(int d=0; d<5-c; d=d+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.printf("==============\n");
		
	/*
		0*		0-1  
		1** 	0-2
		2*** 	0-3
		3** 	0-2
		4* 		0-1
	*/
		//일정한 패턴이 나오다가 다른 패턴으로 변경되는 경우에는 변경되는 시점에서 코드를 분할하면 됩니다.
		for(int x=0; x<5; x=x+1) {
			//3번째 줄 까지의 규칙 
			if(x<=2) {
				for(int y=0; y<x+1; y=y+1) {
					System.out.printf("*");
				}
			//4번째 줄 부터의 규칙 
			}else {
				for(int z=0; z<5-x; z=z+1) {
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("==============\n");
		/*
		      *	공백4개* 
		     * 	공백3개*
		    * 	공백2개*
		   * 	공백1개*
		  * 	공백없음*
		 */
		for(int m=0; m<5; m=m+1) {
			//공백 출력 
			for(int n=0; n<4-m; n=n+1) {
				System.out.printf(" ");
			}
			System.out.printf("*");
			System.out.printf("\n");
		}
	}
}
