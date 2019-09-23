package awt;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.List;

public class ButtonFrame extends Frame {
	// 화면에 보여지는 객체 중에서 값을 가져오거나 설정해야 하는 컴포넌트가 있으면 인스턴스 변수로 생성
	// 체크박스 2개, 라디오 버튼 2개, 일반 버튼 1개
	Checkbox cbChicken, cbPizza;
	Checkbox chicken, pizza;
	Button btn;
	
	// choice에 보여질 데이터 리스트
	List<String> item;
	Choice choice;
	
	public ButtonFrame() {
		cbChicken = new Checkbox("배달의민족");
		cbPizza = new Checkbox("요기요");
		
		CheckboxGroup gender = new CheckboxGroup();
		chicken = new Checkbox("치킨:시켜", gender, true);
		pizza = new Checkbox("피자:시키지마", gender, false);
		
		btn = new Button("확인");
		
		// 패널을 생성해서 컴포넌트들을 패널에 부착
		Panel p = new Panel();
		p.add(cbChicken);
		p.add(cbPizza);
		p.add(chicken);
		p.add(pizza);
		p.add(btn);
		
		// 리스트를 생성하고 데이터를 추가
		item = new ArrayList<String>();
		item.add("양념치킨");
		item.add("간장치킨");
		item.add("후라이드치킨");
		item.add("오븐치킨");
		
		choice = new Choice();
		// Choice에 리시트의 데이터를 추가
		for(String temp : item) {
			choice.add(temp);
		}
		p.add(choice);
		
		// 패널을 프레임에 부착
		add(p);		
		
		// 옵션을 설정
		setSize(300, 300);
		setLocation(200, 200);
		setTitle("배달의민족");
		setBackground(Color.orange);
		setVisible(true);
	}
}
