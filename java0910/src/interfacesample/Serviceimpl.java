package interfacesample;

public class Serviceimpl implements Service {

	@Override
	public void insert() {
		System.out.printf("데이터 삽입\n");
	}
	@Override
	public void read() {
		System.out.printf("데이터 읽기\n");
	}

	@Override
	public void update() {
		System.out.printf("데이터 수정\n");	
	}

	@Override
	public void remove() {
		System.out.printf("데이터 삭제\n");	
	}
}
