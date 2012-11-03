import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class mathsterGUI extends JFrame{

	private static final int WIDTH = 800;
	private static final int LEN = 700;
	
	private JLabel userL, pwL;
	private JTextField userTF, pwTF;
	private JButton enterB, exitB;
	
	//button handlers
	private enterBut entHandler;
	private exitBut exitHandler;
	
	public mathsterGUI(){
				//Instantiate the labels:
				userL = new JLabel("Username: ", SwingConstants.RIGHT);
				pwL = new JLabel("Password: ", SwingConstants.RIGHT);


				//Text fields next:
				userTF = new JTextField(5);
				pwTF = new JTextField(5);
				/*areaTF = new JTextField(10);
				perimeterTF = new JTextField(10);
				*/
				
				
				//Buttons and even handlers
				enterB = new JButton("Enter");
				entHandler = new enterBut();
				enterB.addActionListener(entHandler);
				exitB = new JButton("Exit");
				exitHandler = new exitBut();
				exitB.addActionListener(exitHandler);
						
				
				//Set the window's title.
				setTitle("Mathster - Mastering Math");
				
				//Get the content pane (CP).
				Container pane = getContentPane();
				
				//Set the layout.
				pane.setLayout(new GridLayout(5, 2));
				
				//add stuff to pane
				pane.add(userL);
				pane.add(userTF);
				pane.add(pwL);
				pane.add(pwTF);
				/*pane.add(areaL);
				pane.add(areaTF); */
				pane.add(enterB);
				pane.add(exitB);
				//Other JFrame stuff.
				
				setSize(WIDTH, HEIGHT);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	private class enterBut implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//does something goes to game screen
			//same username and password
			
			
		}

	}
	public class exitBut implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			
		}

	}
	public static void main(String[] args){
		mathsterGUI scrn = new mathsterGUI();
	}
	
	
}
