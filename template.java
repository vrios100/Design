
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class template {

private JFrame frame;	

public template(){

frame = new JFrame("Template");

frame.setSize(1000,1000);	
draw rooms = new draw();
rooms.drawing();
frame.add(rooms);
frame.getContentPane().setBackground(Color.RED); 
frame.setVisible(true);

	
}

public static void main(String[]args){
	template b = new template();
}
}
