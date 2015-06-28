import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//these above only needed while console reading is on

public class Game
{

	Fig[][] field;
	
	/* Figure[] field =  {Figure.W_ROOK, Figure.W_KNIGHT, Figure.W_BISHOP, Figure.W_KING, Figure.W_QUEEN, Figure.W_BISHOP, Figure.W_KNIGHT, Figure.W_ROOK,
			Figure.W_PAWN,Figure.W_PAWN,Figure.W_PAWN,Figure.W_PAWN,Figure.W_PAWN,Figure.W_PAWN,Figure.W_PAWN,Figure.W_PAWN,
			Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,
			Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,
			Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,
			Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,Figure.EMPTY,
			Figure.B_PAWN,Figure.B_PAWN,Figure.B_PAWN,Figure.B_PAWN,Figure.B_PAWN,Figure.B_PAWN,Figure.B_PAWN,Figure.B_PAWN,
			Figure.B_ROOK, Figure.B_KNIGHT, Figure.B_BISHOP, Figure.B_KING, Figure.B_QUEEN, Figure.B_BISHOP, Figure.B_KNIGHT, Figure.B_ROOK };
	*/
	
	
	public Game()
	{
		
		
	}
	
	
	int[] askMove() throws IOException//temorary as long as gui can not accept input 
	{
		int[] nums = new int[4];
		System.out.println("enter start i");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			nums[0] = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
		System.out.println("enter start j");
		try{
			 nums[1] = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
		System.out.println("enter end i");
		try{
			 nums[2] = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
		System.out.println("enter end j");
		try{
			 nums[3] = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
		
		
		return nums;
	}
	
	int calcIndex(int i, int j) throws Exception // bulletproof converter form logic position into array position
	{
		if(i < 0 || i > 8 || j < 0 || j > 8)
			throw new Exception("i oder j zu gross oder zu klein");
		assert (((j-1)*8+(i-1)) >= 0 &&  ((j-1)*8+(i-1)) <= 63);
		return ((j-1)*8+(i-1));
	}
	
	
	void move(int iStart, int jStart, int iEnd, int jEnd) //moves (if possible) a figure
	{
		try
		{
			int p1 = calcIndex(iStart, jStart);
			int p2 = calcIndex(iEnd, jEnd);
			if (field[p1] != Figure.EMPTY)
			{
				if(field[p2] == Figure.EMPTY)
				{
					field[p2] = field[p1];
					field[p1] = Figure.EMPTY;
				}
				else
					System.out.println("End field is taken");
			}
			else
				System.out.println("Start field is empty");
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage()); //Prints out errormessage
		}
		
			
		
		
	}
	
	void paintField()
	{
		for(int i = 0; i <= 63; i++)
		{
			
			
			if (field[i] == Figure.EMPTY)
				System.out.print("O");
			else if(field[i] == Figure.W_ROOK)
				System.out.print("r");
			else if(field[i] == Figure.W_KNIGHT)
				System.out.print("s");
			else if(field[i] == Figure.W_BISHOP)
				System.out.print("b");
			else if(field[i] == Figure.W_PAWN)
				System.out.print("p");
			else if(field[i] == Figure.W_QUEEN)
				System.out.print("q");
			else if(field[i] == Figure.W_KING)
				System.out.print("k");
			else if(field[i] == Figure.B_ROOK)
				System.out.print("R");
			else if(field[i] == Figure.B_KNIGHT)
				System.out.print("S");
			else if(field[i] == Figure.B_BISHOP)
				System.out.print("B");
			else if(field[i] == Figure.B_PAWN)
				System.out.print("P");
			else if(field[i] == Figure.B_QUEEN)
				System.out.print("W");
			else if(field[i] == Figure.B_KING)
				System.out.print("K");
			else
				System.out.print("error");
			
			
			if((i+1)%8 == 0)
				System.out.println("");
			
			
		}
	}
	
	
	
	

}
