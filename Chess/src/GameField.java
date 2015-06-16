import java.awt.*;
import figures.*;



public class GameField extends Panel{
	static Square[] arr=new Square[64];
	boolean blacksTurn;
	
	
	GameField(Dimension s) {
		
		setSize(this.getSize());
		setLocation(0,0);
		setLayout(new GridLayout(9,9));
		
		
		
		
	}
	
	// called my menu-buttons: newGame, load
		public void createNewGame(Figure[] inpArr) {
			//creating a completely new Game
			
			if (inpArr==null) { 
				
				arr[0].setFigure(new Rook(false));
				arr[1].setFigure(new Knight(false));
				arr[2].setFigure(new Bishop(false));
				arr[3].setFigure(new Queen(false));
				arr[4].setFigure(new King(false));
				arr[5].setFigure(new Bishop(false));
				arr[6].setFigure(new Knight(false));
				arr[7].setFigure(new Rook(false));
				arr[8].setFigure(new Pawn(false));
				arr[9].setFigure(new Pawn(false));
				arr[10].setFigure(new Pawn(false));
				arr[11].setFigure(new Pawn(false));
				arr[12].setFigure(new Pawn(false));
				arr[13].setFigure(new Pawn(false));
				arr[14].setFigure(new Pawn(false));
				arr[15].setFigure(new Pawn(false));

				
				arr[63].setFigure(new Rook(false));
				arr[62].setFigure(new Knight(false));
				arr[61].setFigure(new Bishop(false));
				arr[60].setFigure(new Queen(false));
				arr[59].setFigure(new King(false));
				arr[58].setFigure(new Bishop(false));
				arr[57].setFigure(new Knight(false));
				arr[56].setFigure(new Rook(false));
				arr[55].setFigure(new Pawn(false));
				arr[54].setFigure(new Pawn(false));
				arr[53].setFigure(new Pawn(false));
				arr[52].setFigure(new Pawn(false));
				arr[51].setFigure(new Pawn(false));
				arr[50].setFigure(new Pawn(false));
				arr[49].setFigure(new Pawn(false));
				arr[48].setFigure(new Pawn(false));
				
			}
			//create a loadfile game
			if (inpArr!=null) {
				//to-do implement loading mechanism
			}
			
				
			
		}
	
	public boolean canMove(boolean b,int x, int y) { //x= my coordinates ; y = other square's coordinates
		boolean output=false;
		if ((arr[y]).getFigure()==null) {
			switch ( ((arr[x]).getFigure()).getId() ) {
			case 1: output=canMove_King(b, x, y);
					break;
			case 2: output=canMove_Queen(b, x, y);
					break;
			case 3: output=canMove_Bishop(b, x, y);
					break;
			case 4: output=canMove_Knight(b, x, y);
					break;
			case 5: output=canMove_Rook(b, x, y);
					break;
			case 6: output=canMove_Pawn(b, x, y);		// TODO pawn cant move as they capture
					break;
			
			}
			
			
		
		}
		if ((arr[y]).getFigure()!=null) {
			if (b!=((arr[x]).getFigure()).getBlack()) {
				
				// TODO implement capturing figures
				
			}
			
		}
		
		
		return output;
		
	}
	
	
	
	private boolean canMove_King(boolean b, int x, int y) {
		if ( y == x+1 || y == x-1 || y == x+8 || y == x-8 || y == x+9 || y == x+7 || y == x-7 || y == x-9)  {
			if (arr[y].getFigure()==null || (arr[y].getFigure().getBlack()==b) )
				return false;
			else return true;
		}
		return false;

	}
	
	private boolean canMove_Queen(boolean b, int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private boolean canMove_Bishop(boolean b, int x, int y) { //x= my coordinates ; y = other figure's coordinates
		if ( y == x+10 || y == x+17 || y == x+15 || y == x+6 || y == x-10 || y == x-17 || y == x-15 || y == x-6)  {
			if (arr[y].getFigure()==null || (arr[y].getFigure().getBlack()==b) )
				return false;
			else return true;
		}
		return false;
	}

	private boolean canMove_Knight(boolean b, int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	private boolean canMove_Rook(boolean b, int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	private boolean canMove_Pawn(boolean b, int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
