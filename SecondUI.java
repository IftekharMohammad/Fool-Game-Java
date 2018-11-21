import java.lang.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecondUI extends JFrame implements ActionListener{
	private JLabel intro;
	private JButton retry, exit;
	private JPanel panel;
	
	public SecondUI(String s){
		super("Fool Game");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		intro = new JLabel(s);
		intro.setBounds(200,0,450,150);
		intro.setFont(new Font("Times New Roman", Font.BOLD, 35));
		panel.add(intro);
		
		retry = new JButton("Retry");
		retry.setBounds(200,180,100,60);
		retry.setBackground(Color.GREEN);
		retry.setForeground(Color.WHITE);
		retry.setFont(new Font("Times New Roman", Font.BOLD, 18));
		retry.addActionListener(this);
		panel.add(retry);
		
		exit = new JButton("Exit");
		exit.setBounds(500,180,100,60);
		exit.setBackground(Color.RED);
		exit.setForeground(Color.WHITE);
		exit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		exit.addActionListener(this);
		panel.add(exit);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String elementText = ae.getActionCommand();
		
		if(elementText.equals(retry.getText()))
		{
			MainUI m = new MainUI();
			m.setVisible(true);
			this.setVisible(false);			
		}
		else if(elementText.equals(exit.getText()))
		{
			System.exit(0);
		}
	}
	
}