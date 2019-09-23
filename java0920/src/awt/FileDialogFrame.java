package awt;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileDialogFrame extends Frame {
	public FileDialogFrame() {
		setTitle("파일 대화상자 사용하기");
		setBounds(300, 300, 400, 400);
		this.setBackground(Color.orange);
		
		TextField tf = new TextField(40);
		Panel p = new Panel();
		p.add(tf);
		add(p);
				
		setVisible(true);
		
		// 파일 열기 대화상자 생성
		FileDialog fd = new FileDialog(this, "파일열기", FileDialog.LOAD);
		// 디렉토리 설정
		fd.setDirectory("/Users/503a2/Documents/week_ios_yul/notes/chochanghoon");
		// 화면에 출력
		fd.setVisible(true);
		
		// 선택한 파일 경로 및 이름 가져오기
		String filepath = String.format("%s%s", fd.getDirectory(), fd.getFile());
		
		// 다음주 공부할 것 내용
		try {
			BufferedReader b =
					new BufferedReader(
							new InputStreamReader(
									new FileInputStream(
											filepath)));
			String str = b.readLine();
			tf.setText(str);
			b.close();
			}catch(Exception e) {}
		
		tf.setText(filepath);
	
	}
}
