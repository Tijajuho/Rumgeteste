import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIClass {
	
	public GUIClass(){
		JFrame myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("CLick the Button");
		myFrame.setSize(1500,700);
		final JPanel myPanel = new JPanel();
//		JLabel myLabel = new JLabel("Click it. Come on.");

//		myPanel.add(myLabel);
		
		JButton theButton = new JButton("Click ME.");
		
		theButton.setLayout(new BorderLayout(0,0));
		theButton.setPreferredSize(new Dimension(100,30));
		
		
		theButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				myFrame.dispose();
				Random randomGenerator = new Random();
				theButton.setLocation(randomGenerator.nextInt((myFrame.getWidth()-2*theButton.getWidth()))+theButton.getWidth(), 
										randomGenerator.nextInt((myFrame.getHeight()-2*theButton.getHeight()))+theButton.getHeight());		
			}
		});
		
		
		myFrame.add(myPanel);
		myPanel.add(theButton);
//		myPanel.setVisible(true);

		myFrame.setVisible(true);
	}
}
