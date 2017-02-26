
import java.util.Scanner;


public class TicTacToeGame 
{
	private TicTacToeBoard board;
	private Player player1;
	private Player player2;
	private Scanner input;
	public TicTacToeGame()
	{
		input = new Scanner(System.in);
		this.board = new TicTacToeBoard();
		this.player1 = new Player("Player 1", 'X');
		this.player2 = new Player("Player 2", 'O');
	}
	
	public void play()
	{
		Player currPlayer = this.player1;
		do
		{
			this.board.display();
			this.getMove(currPlayer);
			if(currPlayer == this.player1)
			{
				currPlayer = this.player2;
			}
			else
			{
				currPlayer = this.player1;
			}
		}
		while(this.board.hasWinner() == false);
		if(currPlayer == this.player1)
		{
			System.out.println("The Winner is: " + this.player2.getName());
		}
		else
		{
			System.out.println("The Winner is: " + this.player1.getName());
		}
	}
	
	private void getMove(Player player)
	{
		int row = -1;
		int column = -1;
		do
		{
			System.out.print("Please enter a row: ");
			row = this.input.nextInt();
			System.out.print("Please enter a column: ");
			column = this.input.nextInt();
		}
		while(this.board.makeMove(player.getMoveChar(), row, column) == false);
	}
}