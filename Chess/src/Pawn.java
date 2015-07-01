
public class Pawn extends Figure
{

	public Pawn(boolean isBlack, GameField field, int posX, int posY)
	{
		super(isBlack, 6, field, posX, posY);
		// TODO Auto-generated constructor stub
	}

	
	boolean[][] possibleMoves()
	{
		boolean[][] moveField = new boolean[8][8];
		
		for(int i = 0; i < moveField.length; i++)
		{
			for(int j = 0; j < moveField[i].length; j++)
			{
				moveField[j][i] = false; //at the meginning of the algorithm everything is impossible
			}
		}
		
		
		
		
		int direction = 1; //if white, direction is positive, if black dir is negative
		if (getIsBlack()==false) //if this whole statemnt it true, this figure is black
			direction = -1;
		
		
		
		int x= posX;
		int y = posY+(1*direction);
		// forward movement
		if(y <= 7 && y >= 0)
			{
				if ((field.getFigure(x, y) != null)&&field.getFigure(x, y).getIsBlack() != getIsBlack())//checks first if there is another figure and then (short circuit &&) if its the opposite color
				{
					
					moveField[y][x] = true;
				}
			}
		
		// attak movements:
		//left
		x = posX+(1*direction);
		y = posY+(1*direction);
		if(x <= 7 &&x>= 0 && y <= 7 && y >= 0)
		{
			if(true)//if(Main.game.field[j][i] == null)
			{
				//Achtung: kann jede figur momentan angreifen!!!!
				moveField[y][x] = true;
			}
		}
		//right
		x = posX-(1*direction);
		y= posY+(1*direction);
		if(x <= 7 &&x>= 0 && y <= 7 && y>= 0)
		{
			if((field.getFigure(x, y) != null)&&field.getFigure(x, y).getIsBlack() != getIsBlack()) //if(Main.game.field[j][i] == null)
			{
				moveField[y][x] = true;
			}
		}
		return moveField;
	
	}

	
	boolean confirmMove(int newX, int newY)
	{
		boolean[][] lookUp = possibleMoves();
		
		if(lookUp[newY][newX] == true)
		{
			this.posX = newX; // changge the internal position memory of this figure
			this.posY = newY;
			return true;
		}
		else
			return false;
	}

}
