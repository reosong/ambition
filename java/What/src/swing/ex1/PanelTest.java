package swing.ex1;

import java.awt.*;

public class PanelTest {

	private Frame f;
	private Panel p;
	private Button ok,cancel;
	private TextField tf1,tf2;
	
	
	public PanelTest() {
		f= new Frame("Panel ex");
		ok = new Button("전송");
		cancel = new Button("삭제");
		tf1 = new TextField("닥쳐 오라클밖에 모르니깐  ");
		tf2 = new TextField("anyone");
		p= new Panel();
		
		
	}
	
	public void startFrame() {
		f.add(tf1,BorderLayout.NORTH);
		
		p.setBackground(Color.green);
		p.add(ok);
		p.add(cancel);
		
		f.add(p,BorderLayout.CENTER);
		f.add(tf2,BorderLayout.SOUTH);
		
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		PanelTest pa = new PanelTest();
		pa.startFrame();
	}

}
