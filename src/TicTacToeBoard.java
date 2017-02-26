public class TicTacToeBoard 
{
	private char[][] theBoard;
	
	public TicTacToeBoard()
	{
		this.theBoard = new char[6][7];
		this.clearBoard();
	}
	
	public boolean makeMove(char moveChar, int row, int col)
	{
		if(this.theBoard[row][col] == '_')
		{
			this.theBoard[row][col] = moveChar;
			return true;
		}
		System.out.println("Selected column was already marked by other player chose different column");
		return false;
	}
	
	private void clearBoard()
	{
		for(int i = 0; i < this.theBoard.length; i++)
		{
			for(int j = 0; j < this.theBoard[i].length; j++)
			{
				this.theBoard[i][j] = '_';
			}
		}
	}
	
	public boolean hasWinner()
	{
		


		//col winners
         int player1Counter=0;
         int player2Counter=0;
         boolean player1Wins=false;
         boolean player2Wins=false;
		
			for(int j = 0; j < this.theBoard[0].length && !player1Wins; j++)
			{ 
				player1Counter=0;
				player2Counter=0;
				
				for(int i = 0; i < this.theBoard.length; i++)
				{
					 if(this.theBoard[i][j] == 'X')
					 {
						 player1Counter++;
						 if(player1Counter ==4)
						 {
							 player1Wins=true;
							 break;	 
						 }
						   
						 
					 }else
					 {
						 player1Counter=0;
					 }
					 
				}
			}
		
			if(!player1Wins)
			{
				for(int j = 0; j < this.theBoard[0].length && !player2Wins; j++)
				{ 
					
					player2Counter=0;
					
					for(int i = 0; i < this.theBoard.length; i++)
					{
						 if(this.theBoard[i][j] == 'X')
						 {
							 player2Counter++;
							 if(player2Counter ==4)
							 {
								 player2Wins=true;
								 break;	 
							 }
							   
							 
						 }else
						 {
							 player2Counter=0;
						 }
						 
					}
				}
			}
		

		return 
				player1Wins || player2Wins ;
 	}
	
	public void display()
	{
		System.out.println("*****************");
		for(int i = 0; i < this.theBoard.length; i++)
		{
			for(int j = 0; j < this.theBoard[i].length; j++)
			{
				System.out.print(this.theBoard[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}