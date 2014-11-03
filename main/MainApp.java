package main;

import java.awt.EventQueue;

import views.MainFrame;

public class MainApp {

	public MainApp() {
		
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				MainFrame mv = new MainFrame();
				mv.setVisible(true);
			}
		});
	}
}
