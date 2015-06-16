import java.awt.*;
import java.awt.event.*;
public class GUI extends Frame {
	
	MenuBar menubar;
	Menu data,help;
	MenuItem newGame,save,load,close;
	GameField field;
	
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
		
		field=new GameField(this.getSize());
	
		//adding components to main frame
		this.add(BorderLayout.CENTER,field);
		setVisible(true);
	}
	
	public void createMenu() {
		menubar=new MenuBar();
		data=new Menu("Datei");
		help=new Menu("Hilfe");
		
		newGame=new MenuItem("Neues Spiel", new MenuShortcut(KeyEvent.VK_N));
		save=new MenuItem("Speichern", new MenuShortcut(KeyEvent.VK_S));
		load=new MenuItem("Laden", new MenuShortcut(KeyEvent.VK_O));
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
	
}


