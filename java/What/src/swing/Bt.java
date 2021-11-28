package swing;

import java.awt.*;

public class Bt {
	private Frame frame;
	private Button center,west,east,north,south;
	private TextField tf1;
	
	public Bt() {
		frame = new Frame("ex");
		south = new Button("ㅎㅎ");
		west = new Button("밥 ");
		east = new Button("가요 ");
		center = new Button("먹으러 ");
		tf1 = new TextField();
		tf1.setText("오늘 하루도 고생하셨습니다 ~");
				
	}
	
	
	private void startFrame() {
		frame.add(tf1,"North");
		frame.add(south, "South");
		frame.add(west,"West");
		frame.add(east,"East");
		frame.add(center,"Center");
		
		
		frame.setSize(400,400);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		
		Bt test = new Bt();
		test.startFrame();
		
		
		
		
		
		
	}

}
