package swing.ex3;

import javax.swing.*;

public class JTapTest extends JFrame {
	ImageIcon icon1,tabicon;
	JButton btn1,btn2;
	JTabbedPane jp;
	JLabel jlab;
	JPanel jpan;
	JTextField f;
	JTextArea tArea;
	
	public JTapTest() {
		//1
		super("텝 테스트 ");
		icon1 = new ImageIcon("koala.jpg");
		jlab = new JLabel(icon1);
		//3
		tabicon = new ImageIcon("tomcat.png");
		jpan = new JPanel();
		f= new JTextField("text abx");
		btn1 = new JButton("send");
		jpan.add(f);
		jpan.add(btn1);
		
		//2
		tArea = new JTextArea(7,20);
		tArea.setText("write");
		
		
		jp= new JTabbedPane();
		jp.addTab("tttt", jlab);
		jp.addTab("wqt",new JPanel().add(tArea));
		jp.addTab("eee", tabicon,jpan,"eqwt");
		add(jp);
		setBounds(0,0,400,400);
		setVisible(true);
	}
	public static void main (String[] args) {
		new JTapTest();
	}

}
