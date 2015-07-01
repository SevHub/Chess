

public abstract class Figure {
	private boolean isBlack;
	private int id; //tells what kind of figure
	private GameField field;
	private int posX;
	private int posY;
	
	/* 1 = King
	 * 2 = Queen
	 * 3 = Bishop
	 * 4 = Knight
	 * 5 = Rook
	 * 6 = Pawn 
	 */
	
	public Figure(boolean isBlack, int id, GameField field, int posX, int posY) {
		this.isBlack=isBlack;
		this.id=id;
		this.field = field;
		this.posX = posX;
		this.posY = posY;
	}
	
	public boolean getIsBlack() {
		return isBlack;
	}
	public int getId() {
		return id;
	}
	
	abstract boolean[][] possibleMoves(); // returns a map of possible moves for the gui
	abstract boolean confirmMove(int newX, int newY); // tells if move is possible, and vhanges the position inside the figure object
	
	
}
