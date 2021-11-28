package swing.ex1;

import java.awt.*;
import java.awt.event.*;

public class FlowTest1 implements WindowListener {
	private Frame frame;
	private Button button1,button2,button3;
	
	public FlowTest1() {
		frame = new Frame("adaper 사용 전 ");
		button1 =  new Button("ok");
		button2 = new Button("open");
		button3 = new Button("close");
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
	System.exit(0);		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
