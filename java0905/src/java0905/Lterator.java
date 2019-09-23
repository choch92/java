package java0905;

public class Lterator {

	public static void main(String[] args) {
		//배열 만들기 
		String [] games = {"LOL", "StarCraft", "Overwatch", "BattleGround"};
		//배열의 데이터 전체 접근 - 데이터 갯수를 리터럴로 작성 
		//리터럴을 사용하면 데이터에 변화가 생기면 수정을 해야 합니다.
		for(int i = 0; i<4; i=i+1) {
			System.out.printf("%s\n", games[i]);
		}
		System.out.printf("======================\n");
		//데이터 갯수를 속성을 이용해서 설정 
		//데이터에 변화가 생겨도 출력부분을 수정할 필요가 없습니다. 
		for(int i = 0; i<games.length; i=i+1) {
			System.out.printf("%s\n", games[i]);
		}
		System.out.printf("======================\n");
		//자주 사용하는 데이터가 속성의 형태로 있다면 매번 이름을 찾아서 접근하는것은 시간 낭비가 될 수 있습니다.
		//이런 경우에는 속성을 임시변수에 대입해서 사용하면 접근 속도가 향상 될 수 있다.
		int len = games.length;
		for(int i = 0; i<len; i=i+1) {
			System.out.printf("%s\n", games[i]);
		}
		System.out.printf("======================\n");
		//빠른 열거 사용 
		for(String game : games) {
			System.out.printf("%s\n", game);
		}
		System.out.printf("======================\n");
	}
}
