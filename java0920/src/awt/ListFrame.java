package awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.TextField;
import java.util.ArrayList;

public class ListFrame extends Frame {
	// 레이블 1개와 List 1개를 배치
	Label lbl;
	List list;
	
	// List에 출력할 데이터
	ArrayList<String> data;
	
	// 한 줄의 문자열과 여러 줄의 문자열을 입력받는 컴포넌트
	TextField tf;
	TextArea ta;
	
	public ListFrame() {
		lbl = new Label("치킨의 종류");
		// list에 출력할 데이터 생성
		data = new ArrayList<>();
		data.add("핫쇼킹치킨");
		data.add("후라이드치킨");
		data.add("간장치킨");
		data.add("까르보나라치킨");
		data.add("양념치킨");
		data.add("스노윙치킨");
		data.add("파닭치킨");
		data.add("옛날통닭");
		data.add("오븐구이치킨");
		data.add("어니언치킨");
		data.add("이제그만치킨");
		
		// 화면에 4개의 항목을 출력하고 여러 개 선택이 가능하도록 생성
		list = new List(4, true);
		
		for(String lang : data) {
			list.add(lang);
		}
		
		tf = new TextField(30);
		// 입력할 때 *로 출력
		tf.setEchoChar('*');
		
		ta = new TextArea(10, 50);
		
		// 스크롤 바를 만들어서 자신보다 큰 영역을 스크롤을 이용해서 출력할 수 있도록 해주는 컴포넌트
		ScrollPane sp = new ScrollPane();
		sp.add(ta);
		
		// 컴포넌트들을 모아서 출력할 Panel 생성
		Panel p = new Panel();
		p.add(lbl);
		p.add(list);
		p.add(tf);
		p.add(ta);
		
		// 프레임에 패널을 배치
		add(p);
		
		// 옵션을 설정
		this.setBounds(300, 300, 1000, 1000);
		this.setBackground(Color.orange);
		// 화면을 수동으로 키우게 하는 것을 방지하는 방법
		this.setResizable(false);
		setVisible(true);
		
	}
}
