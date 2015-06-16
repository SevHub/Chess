import java.awt.*;
import java.awt.event.*;

import figures.*;

public class GUI extends Frame {
	
	
	private MenuBar menubar;
	private Menu data,help;
	private MenuItem newGame,save,load,close;
	private GameField field;
	
	public GUI(Figure[] arr) {
		super("Schach");
		setLayout(new BorderLayout());
		setLocation(100,100);
		setSize(800,800);
		setResizable(false);
		//setBackground(new Color(205,170,125));
		this.addWindowListener(new WindowAdapter() { //closing "x"
		    public void windowClosing(WindowEvent e) {
		        System.exit(0);
		    }
		});
				
		createMenu();
		createField();
		
		field.createNewGame(null);
	
		//adding components to main frame
		this.add(BorderLayout.CENTER,field);
		setVisible(true);
	}
	
	public void createMenu() {
		menubar=new MenuBar();
		data=new Menu("Datei");
		help=new Menu("Hilfe");
		
		newGame=new MenuItem("Neues Spiel", new MenuShortcut(KeyEvent.VK_N));
		newGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				field.createNewGame(null);
			}
		});
		
		save=new MenuItem("Speichern", new MenuShortcut(KeyEvent.VK_S));
		//to-do implement saving mechanism
		load=new MenuItem("Laden", new MenuShortcut(KeyEvent.VK_O));
		//to-do implement loading mechanism
		close=new MenuItem("Beenden",new MenuShortcut(KeyEvent.VK_E));
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		data.add(newGame);
		data.add(save);
		data.add(load);
		data.add(close);
		
		menubar.add(data);
		menubar.add(help);
		setMenuBar(menubar);
	}
	
	//creating a chess typical field with the Square-Array
	
	public void createField() {
		int arrCounter=0;
		
		field=new GameField(this.getSize());
		
		field.add(new Label(""));
		for (int i=0;i<8;i++) {
			Label l =new Label( ((char) (97+i))+""); 	// top border letters
			l.setAlignment(Label.CENTER);
			field.add(l);
		}
		for (int i=1;i<9;i++) {				
			
			Label l =new Label(""+(9-i));				// left border numbers
			l.setAlignment(Label.CENTER);
			field.add(l);

			Square hlp=null;
			for (int j=0;j<8;j++) {
				
				
				if (i%2==0) {
					if (j%2==0)
						hlp= new Square((((i-1)*8)+j), Color.gray);
					else 
						hlp= new Square((((i-1)*8)+j), Color.lightGray);
				}
				else {
					if (j%2==1)
						hlp= new Square((((i-1)*8)+j), Color.gray);
					else 
						hlp= new Square((((i-1)*8)+j), Color.lightGray);
				}
				hlp.setSize(100,100);
				setMouseListener(hlp);
				field.arr[arrCounter]=hlp;					// inserting panels into PanelArray
				arrCounter++;
				
				
				field.add(hlp);	
			}		
		}
	}
	
	
	
		// adding MouseListeners to a Square
	public void setMouseListener(final Square sq) { 
		sq.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent ev) {
				
				if (sq.getFigure()!=null) {	//check whether my square has figure
					
					if (sq.selected==-1) { // no Square yet checked
						sq.selected=sq.id;
						sq.setBackground(Color.green);
					}
					
					else if (sq.selected!=sq.id) { // not the same Square was chosen

							sq.target=sq.id;
								if (field.canMove(sq.getFigure().getBlack(),sq.selected,sq.target)) {
									field.arr[sq.target].setFigure( field.arr[sq.selected].getFigure() ); //set my figure on enemies figure's square
									// TODO change image of the square
								}	
							field.arr[sq.selected].setBackground(field.arr[sq.selected].getFieldColor());
							sq.selected=-1;
							sq.target=-1;
							
						
				    }	 
					else { // same Square was chosen
						sq.selected=-1;
						sq.setBackground(sq.getFieldColor());
						
					}
				}
			}
			
			
		});
	}
	
	
	
	
}


