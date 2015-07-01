import java.awt.*;

public class Square extends Panel{
	static int selected=-1;
	static int target=-1;
	Image img;
	private Figure figure;
	private final Color fieldColor;
	int id;
	Square(int i, Color c) {
		super();
		
		id=i;
		fieldColor=c;
		setBackground(fieldColor);
		figure = null; //be sure that at least null is assigned to this
		
	}
	
	void setFigure(Figure f) {
		figure=f;		
	}
	
	Figure getFigure() {
		return figure;
	}
	
	Color getFieldColor() {
		return fieldColor;
	}
	
}
