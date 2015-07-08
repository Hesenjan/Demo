package com.yangraq.install.demo;

import javax.swing.JFrame;

public class Main extends JFrame {

	public Main() {
		// TODO Auto-generated constructor stub
		this.setTitle("计算器");
		this.setResizable(false);
	
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}

}
