import javax.swing.*;
import java.awt.*;
public class draw extends JPanel {
//drawing on JPanel not frame
	
	public void drawing(){
		repaint(); //calls paintComponent method
	}
	
	public void paintComponent (Graphics a){
		super.paintComponent(a);
		
		a.setColor(Color.BLACK);
		a.drawRect(50,50, 800, 650);
		//a.fillRect(10, 15, 500, 500); //x,y,width,height
	}
}
