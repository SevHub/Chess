import java.awt.*;


public class GameField extends Panel{
	Panel[] arr;
	Game localGame = Main.getGame();
	
	GameField(Dimension s) {
		arr=new Panel[64];
		int arrCounter=0;
		
		setSize(this.getSize());
		setLocation(0,0);
		setLayout(new GridLayout(9,9));
		add(new Label(""));
		for (int i=0;i<8;i++) {
			add(new Label( ((char) (97+i))+""));
		}
		for (int i=1;i<9;i++) {							//creating a chess typical field
			add(new Label(""+i));
			Panel hlp=null;
			for (int j=0;j<8;j++) {
				hlp= new Panel();
				//hlp.setLayout(new BorderLayout());
				hlp.setSize(100,100);
				if (i%2==0) {
					if (j%2==0)
						hlp.setBackground(Color.gray);
					else 
						hlp.setBackground(Color.lightGray);
				}
				else {
					if (j%2==1)
						hlp.setBackground(Color.gray);
					else 
						hlp.setBackground(Color.lightGray);
				}
				
				String tmp;
				int q = ((i-1)*8)+j;
				
				if (localGame.field[q] == Figure.EMPTY)
					tmp =("O");
				else if(localGame.field[q] == Figure.W_ROOK)
					tmp =("r");
				else if(localGame.field[q] == Figure.W_KNIGHT)
					tmp =("s");
				else if(localGame.field[q] == Figure.W_BISHOP)
					tmp =("b");
				else if(localGame.field[q] == Figure.W_PAWN)
					tmp =("p");
				else if(localGame.field[q] == Figure.W_QUEEN)
					tmp =("q");
				else if(localGame.field[q] == Figure.W_KING)
					tmp =("k");
				else if(localGame.field[q] == Figure.B_ROOK)
					tmp =("R");
				else if(localGame.field[q] == Figure.B_KNIGHT)
					tmp =("S");
				else if(localGame.field[q] == Figure.B_BISHOP)
					tmp =("B");
				else if(localGame.field[q] == Figure.B_PAWN)
					tmp =("P");
				else if(localGame.field[q] == Figure.B_QUEEN)
					tmp =("W");
				else if(localGame.field[q] == Figure.B_KING)
					tmp =("K");
				else
					tmp =("error");
				
				
				
				
				//hlp.add(new Label((((i-1)*8)+j)+""));
				hlp.add(new Label(tmp));
				arr[arrCounter]=hlp;					// inserting panels into PanelArray
				add(hlp);
				
			}
			
		}
		
	}
	
	void redraw()
	{
		
		
	}
	
}
