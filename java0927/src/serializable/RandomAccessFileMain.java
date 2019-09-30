package serializable;

import java.io.RandomAccessFile;

public class RandomAccessFileMain {

	public static void main(String[] args) {
		// DTO 클래스의 객체 만들기
		DTO dto = new DTO();
		dto.setNum(1);
		dto.setId("itggangpae");
		dto.setPw("!234");
		dto.setName("cho");
		
		try(RandomAccessFile f = new RandomAccessFile("./random.txt", "rw")){
			// 문자열을 바이트 배열로 변환해서 기록
			f.write("Hello World".getBytes());
			// 파일 포인터 이동
			f.seek(6);
			// 5바이트 읽기
			byte [] b = new byte[5];
			f.read(b);
			// 문자열로 변환해서 출력
			String str = new String(b);
			System.out.printf("%s\n", str);
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
		}
	}
}
