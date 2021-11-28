package swing.ex2;

import java.applet.*;
import java.awt.*;

public class HelloWorld extends Applet{
	Font f;
	
	public void init() {
		f = new Font("SansSerif",Font.BOLD,20);
		
	}
	public void start() {
		setBackground(Color.yellow);
		repaint();
		
	}
	public void paint(Graphics g) {
		g.setFont(f);
		g.drawString("Hello World",10, 80);
	}
}
