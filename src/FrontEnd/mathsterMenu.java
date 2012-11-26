import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class mathsterMenu extends JFrame {
	
	public class statsBut implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
		
	}

}

public class playBut implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
		
	}

}


	private static final int WIDTH = 800;
	private static final int HEIGHT = 700;
	
	private JLabel welcome;
	private JButton playB, statsB;
	
	private playBut playHandler;
	private statsBut statsHandler;
	
	public mathsterMenu() {
		welcome = new JLabel("Welcome to Mathster");
		welcome.setFont(new Font("Serif", Font.PLAIN, 90));
		
		playB = new JButton("Play");
		playHandler = new playBut();
		playB.addActionListener(playHandler);
		statsB = new JButton("Status");
		statsHandler = new statsBut();
		statsB.addActionListener(statsHandler);
		
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Set the window's title.
		setTitle("Mathster - Mastering Math");
		
		//Get the content pane (CP).
		Container pane = getContentPane();
		
		//Set the layout.
		pane.setLayout(new GridLayout(5, 2));
		
		//add stuff to pane
		pane.add(welcome);
		pane.add(playB);
		pane.add(statsB);

	}
	
	public static void main(String[] args) {
		mathsterMenu scrn = new mathsterMenu();
	}

}
