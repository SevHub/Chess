import java.util.Arrays;


public class Pawn extends Fig
{

	public Pawn(boolean color, int positionI, int positionJ)
	{
		super(6, color, positionI, positionJ);
		// TODO Auto-generated constructor stub
	}

	
	void move()
	{
		

	}


	boolean[][] possibleMoves()
	{
		int direction = 1; //if white, direction is positive, if black dir is negative
		if (color==false)
			direction = -1;
			
		boolean[][] field = new boolean[8][8];
		for(int i = 0; i < field.length; i++) //fills the array with false
		{
			for(int j = 0; j < field[i].length; j++)
			{
				field[i][j] = false;
			}
		}
		
		
		
		int i = positionI;
		int j = positionJ+(1*direction);
		// forward movement
		if(j <= 7 && j >= 0)
			{
				if (true)//if(Main.game.field[j][i] == null)
				{
					
					field[j][i] = true;
				}
			}
		
		// attak movements:
		//left
		i = positionI+(1*direction);
		j = positionJ+(1*direction);
		if(i <= 7 && i >= 0 && j <= 7 && j >= 0)
		{
			if(true)//if(Main.game.field[j][i] == null)
			{
				//Achtung: kann jede figur momentan angreifen!!!!
				field[j][i] = true;
			}
		}
		//right
		i = positionI-(1*direction);
		j = positionJ+(1*direction);
		if(i <= 7 && i >= 0 && j <= 7 && j >= 0)
		{
			if(true) //if(Main.game.field[j][i] == null)
			{
				field[j][i] = true;
			}
		}
		return field;
	}

}
