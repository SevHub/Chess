import java.awt.Panel;
import java.awt.event.*;
public class Square extends Panel implements MouseListener{
	private Figure figure;
	int id;
	Square(int i) {
		super();
		id=i;
		addMouseListener(this//new MouseAdapter() {
			//public void mouseClicked(MouseEvent e) {
			//	setBackground(Color.red);
			//    }
			      
			   
		);
	}
	
	
	
	
}
