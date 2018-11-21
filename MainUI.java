import java.lang.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainUI extends JFrame implements MouseListener,ActionListener{
	private JLabel intro;
	private JButton yes, no;
	private JPanel panel;
	
	public MainUI(){
		super("Fool Game");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		intro = new JLabel("Are You A Fool ???");
		intro.setBounds(250,0,350,150);
		intro.setFont(new Font("Times New Roman", Font.BOLD, 35));
		panel.add(intro);
		
		yes = new JButton("Yes");
		yes.setBounds(200,180,100,60);
		yes.setBackground(Color.GREEN);
		yes.setForeground(Color.WHITE);
		yes.setFont(new Font("Times New Roman", Font.BOLD, 18));
		yes.addMouseListener(this);
		yes.addActionListener(this);
		panel.add(yes);
		
		no = new JButton("No");
		no.setBounds(500,180,100,60);
		no.setBackground(Color.RED);
		no.setForeground(Color.WHITE);
		no.setFont(new Font("Times New Roman", Font.BOLD, 18));
		no.addMouseListener(this);
		no.addActionListener(this);
		panel.add(no);
		
		this.add(panel);
	}
	
	public int RandomCoordinateX(){
		Random r1 = new Random();
		
		int x = r1.nextInt(680); 
		if(x >=105 && x<=401){
			return RandomCoordinateX();
		}
		return x;
	}
	
		public int RandomCoordinateY(){
		Random r2 = new Random();
		int x = r2.nextInt(330);
		if(x >=119 && x<=241){
			return RandomCoordinateY();
		}
		return x;
	}
	
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource().equals(yes))
		{
		}
		else if(me.getSource().equals(no))
		{
			no.setBounds(RandomCoordinateX(),RandomCoordinateY(),100,60);
		}
		else{}
	}

	public void mouseExited(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	
	public void actionPerformed(ActionEvent ae)
	{
		String elementText = ae.getActionCommand();
		
		if(elementText.equals(yes.getText()))
		{
			SecondUI s = new SecondUI("Yes, You Are A Fool !!");
			s.setVisible(true);
			this.setVisible(false);			
		}
		else if(elementText.equals(no.getText()))
		{
			SecondUI s = new SecondUI("Yes, You Are Not A Fool !!");
			s.setVisible(true);
			this.setVisible(false);	
		}
	}
	
}