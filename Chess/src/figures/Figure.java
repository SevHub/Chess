package figures;

public abstract class Figure {
	private boolean black;
	private int id;
	
	/* 1 = King
	 * 2 = Queen
	 * 3 = Bishop
	 * 4 = Knight
	 * 5 = Rook
	 * 6 = Pawn 
	 */
	
	public Figure(boolean color, int i) {
		black=color;
		id=i;
	}
	
	public boolean getBlack() {
		return black;
	}
	public int getId() {
		return id;
	}
}
