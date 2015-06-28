
public abstract class Fig
{

	int type; // 1 = king, 2 = queen, 3 = rook, 4 = bishop, 5 = knight, 6 = pawn 
	boolean color; //true = white, false = black
	int positionI;
	int positionJ;
	
	
	public Fig(int type, boolean color, int positionI, int positionJ)
	{
		this.type = type;
		this.color = color;
		this.positionI = positionI;
		this.positionJ = positionJ;
	}

	abstract void move();
	
	abstract boolean[][] possibleMoves(); //retruns a fieldset with true = move possible 
	
	
}
