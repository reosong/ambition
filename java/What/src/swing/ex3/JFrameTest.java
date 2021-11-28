package swing.ex3;

import java.awt.*;

import javax.swing.*;



public class JFrameTest extends JFrame{
	public JFrameTest() {
		super("test11");
		JButton btn1 = new JButton("추가");
		JTextField f1 = new JTextField("jframe test");
		JButton btn2 = new JButton("삭제");
		
		Container con = getContentPane();
		con.add(f1,"North");
		con.add(btn1,"Center");
		con.add(btn2,"South");
		setSize(200,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new JFrameTest();
		
	}

}
