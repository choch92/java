package serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) {
		// DTO 클래스의 객체 만들기
		DTO dto = new DTO();
		dto.setNum(1);
		dto.setId("itggangpae");
		dto.setPw("!234");
		dto.setName("cho");
		/**
		// 객체를 저장하는 스트림 - ObjectOutputStream
		// try() 안에서 생성한 객체는 close를 호출하지 않아도 사용이 끝나면 자동으로 close() 해줌
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./oos.txt"))){
			// 객체를 파일에 기록
			// write나 print는 버퍼에 기록
			// Serializable 인터페이스를 implements를 하지 않으면 ClassCastException 발생
			oos.writeObject(dto);
			// 버퍼의 내용을 출력 - 기록을 할 때는 마지막에 flush
			oos.flush();
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
		**/
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./oos.txt"))){
			DTO obj = (DTO)ois.readObject();
			System.out.printf("%s\n", obj.getName());
		}catch(Exception e) {}
	}

}
