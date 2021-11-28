package swing.ex2;

import java.awt.*;
import java.awt.event.*;

public class MovieTest extends Frame implements ActionListener {

	TextField tMovieTitle = new TextField(30);
	Button btnTitleInsert = new Button("제목추가");
	Button btnTitleDelete = new Button("모두삭제");
	List movieList = new List();
	
	Button exit = new Button("종료");
	
	public MovieTest() {
		super("영화정보 관리 화면");
		
		movieList.setBackground(Color.green);
		Panel p =new Panel();
		p.add(new Label("영화제목 입력"));
		p.add(tMovieTitle);
		p.add(btnTitleDelete);
		p.add(btnTitleInsert);
		
		add(BorderLayout.NORTH,p);
		add(BorderLayout.CENTER,movieList);
		add(BorderLayout.SOUTH,exit);
		
		setBounds(0,0,800,600);
		setVisible(true);
		
		movieList.addActionListener(this);
		btnTitleInsert.addActionListener(this);
		btnTitleDelete.addActionListener(this);
		exit.addActionListener(this);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		String mTitle;
		if(str.equals("제목추가")) {
			System.out.println("add");
			mTitle = tMovieTitle.getText().trim();
			movieList.add(mTitle);
			System.out.println(mTitle);
		}else if (str.equals("모두삭제")) {
			System.out.println("delete");
			movieList.removeAll();
			
		}else {
			movieList.remove(str);
		}
		if(str.equals("종료"))
		System.exit(0);
	}

	public static void main(String[] args) {
		new MovieTest();
	}
}
