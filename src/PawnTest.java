import static org.junit.Assert.*;

import org.junit.Test;


public class PawnTest
{

	@Test
	public void test()
	{
		
		Pawn t = new Pawn(false,4,0 );
		boolean[][] b = t.possibleMoves();
		
		for(boolean[] x: b)
		{
			for(boolean y: x)
			{
				if(y)
					System.out.print("O");
				else
					System.out.print("X");
			}
			System.out.println("");
		}
		
		//fail("Not yet implemented");
	}

}
