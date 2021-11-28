package swing.ex2;

import java.awt.*;
import java.awt.event.*;

public class Mousetest {
	private Frame frame;
	private TextField tpos;
	
	public Mousetest() {
		frame = new Frame("mouse");
		tpos = new TextField("좌표 ");
		
	}
	public class MouseHandler extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			int xPos = e.getX();
			int yPos = e.getY();
			String pos= "x좌표 : "+xPos + "y좌표 : "+ yPos;
			System.out.println(pos);
			tpos.setText(pos);
		}
		
	}
	public class WindowHandler extends WindowAdapter{
		public void windowClosing(WindowEvent arg0) {
			System.out.println("end");
			System.exit(0);
		}
	}
	
	
	public void startFrame() {
		frame.addMouseListener(new MouseHandler());
		frame.addWindowListener(new WindowHandler());
		frame.add(tpos,"North");
		frame.setSize(200,200);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		
		Mousetest mt = new Mousetest();
		mt.startFrame();
			
			
	}
	
	
	
	
	
}
