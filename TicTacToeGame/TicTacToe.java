class TicTacToe
{
	public static void main(String args[])
		{
			char [][] g_board=
			 {
				{' ', '|' , ' ', '|', ' '},

				{'-', '|' , '-', '|', '-'},

				{' ', '|' , ' ', '|', ' '},

				{'-', '|' , '-', '|', '-'},

				{' ', '|' , ' ', '|', ' '}
			};


		print_board(g_board);
		
		}
		
	static void print_board(char [][] g_board)
	{
		for(int r= 0; r<g_board.length;r++)
		{
	
			for(int c =0; c<g_board[0].length;c++)
			{
				System.out.print(g_board[r][c]);
			}
			System.out.println();
		}
}
}
			
			