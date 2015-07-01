import java.awt.*;

import figures.*;



public class GameField extends Panel{
	static Square[][] arr=new Square[8][8];
	
	/*
	arr[y][x]
	
	----x--->
	|	
	|	(0,0)(0,1)(0,2)....(0,7)
	y	(1,0)(1,1)			 :
	|	:					 :
	|	:					 :
	V	(7,0)..............(7,7)
	*/
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
				
				arr[0][0].setFigure(new Rook(false));
				arr[0][1].setFigure(new Knight(false));
				arr[0][2].setFigure(new Bishop(false));
				arr[0][3].setFigure(new Queen(false));
				arr[0][4].setFigure(new King(false));
				arr[0][5].setFigure(new Bishop(false));
				arr[0][6].setFigure(new Knight(false));
				arr[0][7].setFigure(new Rook(false));
				arr[1][0].setFigure(new Pawn(false));
				arr[1][1].setFigure(new Pawn(false));
				arr[1][2].setFigure(new Pawn(false));
				arr[1][3].setFigure(new Pawn(false));
				arr[1][4].setFigure(new Pawn(false));
				arr[1][5].setFigure(new Pawn(false));
				arr[1][6].setFigure(new Pawn(false));
				arr[1][7].setFigure(new Pawn(false));

				
				arr[7][0].setFigure(new Rook(false));
				arr[7][1].setFigure(new Knight(false));
				arr[7][2].setFigure(new Bishop(false));
				arr[7][3].setFigure(new Queen(false));
				arr[7][4].setFigure(new King(false));
				arr[7][5].setFigure(new Bishop(false));
				arr[7][6].setFigure(new Knight(false));
				arr[7][7].setFigure(new Rook(false));
				arr[6][0].setFigure(new Pawn(false));
				arr[6][1].setFigure(new Pawn(false));
				arr[6][2].setFigure(new Pawn(false));
				arr[6][3].setFigure(new Pawn(false));
				arr[6][4].setFigure(new Pawn(false));
				arr[6][5].setFigure(new Pawn(false));
				arr[6][6].setFigure(new Pawn(false));
				arr[6][7].setFigure(new Pawn(false));
				
			}
			//create a loadfile game
			if (inpArr!=null) {
				//to-do implement loading mechanism
			}
			
				
			
		}
	
	
	// new funktion by sev
	Figure getFigure(int x, int y)
	{
		return arr[y][x].getFigure();
	}
		
		
	// this funktions might be obsolete so far
	
	/*
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
	*/

}
