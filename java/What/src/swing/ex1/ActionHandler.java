package swing.ex1;

import java.awt.event.*;

public class ActionHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("btn1"))
			System.out.println("버튼 1");
		if(e.getActionCommand().equals("btn2"))
			System.out.println("버튼 2");
		if(e.getActionCommand().equals("btn3"))
			System.out.println("버튼 3");
		if(e.getActionCommand().equals("btn4"))
			System.out.println("버튼 4");
		if(e.getActionCommand().equals("btn5"))
			System.out.println("버튼 5");
		
	}

}
