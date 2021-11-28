package swing.ex1;

import java.awt.*;
import java.awt.event.*;

public class FlowTest2 extends WindowAdapter {

	private Frame frame;
	private Button button1,button2,button3;
	
	
	
	public FlowTest2() {
		frame = new Frame("ex");
		button1 = new Button("ok");
		button2 = new Button("open");
		button3 = new Button("close");
	}
	
	public void startFrame() {
		frame.addWindowListener(this);
		System.out.println(this);
		
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		FlowTest2 flow = new FlowTest2();
		flow.startFrame();
	}

}
