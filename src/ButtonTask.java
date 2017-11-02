
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonTask implements ActionListener {
	private JFrame frame;
	private JButton b1;
	private JButton b2;
	private JTextField text;

	public ButtonTask()
	{
		frame = new JFrame("Two Buttons");
		b1 = new JButton("CYA(LATER)N");
		b2 = new JButton("RED");
		text = new JTextField("Type something in, press a button, and see what happens!");
		

		b1.addActionListener(this);//assign the action to this button
		b2.addActionListener(this);
		b1.setBounds(50,100,100,100);//set x,y,width,height of button
		b2.setBounds(300,100,100,100);
		text.setBounds(50,300,300,50);

		frame.setSize(400,500);//400 width and 500 height 
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setLayout(null);//using no layout managers 
		frame.add(b1);//add b1 to the frame
		frame.add(b2);
		frame.add(text);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//end program when window closes
		frame.setVisible(true);//make the frame visible
	}

	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource() == b1)
		{
			System.out.println("button 1 was pressed");
			b2.setText(text.getText());
			frame.getContentPane().setBackground(Color.CYAN);
		}
		if (evt.getSource()== b2) {
			System.out.println("button 2 was pressed");
			b1.setText(text.getText());
			frame.getContentPane().setBackground(Color.RED);
		}
	}

	public static void main(String[]args)
	{
		ButtonTask bt = new ButtonTask();
	}
}
