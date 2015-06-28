import java.awt.*;
import java.io.IOException;
public class Main {
	
	
	static Game game = new Game();
	public static Game getGame()
	{
		return game;
	}
	
	public static void main (String[] args) {
		
		
		// temporary no gui is needed
		GUI gui=createGUI();
		
		
		for(int i = 1; 0 <= 10; i++) //sicherheitshalber begrenzete anzahl an runden
		{
		
			try
			{
				int[] num = game.askMove();
				game.move(num[0], num[1], num[2], num[3]);
				game.paintField();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
		
			
		
		//game.paintField();
		
		//some testing:
		//game.move(3, 2, 3, 4);
		//game.paintField();
		
		
	}
	
	
	
	public static GUI createGUI() {
		Figure[] figureArr = new Figure[64];
		return new GUI(figureArr);
		
		
		
		
	}
}
