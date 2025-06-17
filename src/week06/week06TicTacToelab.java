package week06;

import java.util.Scanner;

public class week06TicTacToelab {

	static String[] gameBoard = new String[9];
	static Scanner scanner = new Scanner(System.in);
	static String currentPlayer = "X";  // X always starts

	// Your initialize method - perfect!
	public static void initialize(String[] board) {
		for (int i = 0; i < board.length; i++) {
			board[i] = String.valueOf(i + 1);
		}
	}

	public static void displayBoard(String[] board) {
	    System.out.println("+---+---+---+");
	    System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
	    System.out.println("+---+---+---+");
	    System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
	    System.out.println("+---+---+---+");
	    System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
	    System.out.println("+---+---+---+");
	}
	public static boolean checkWin(String[]board ,String player) {
		int [][] winPatterns = {
				{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
				{0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
				{0, 4, 8}, {2, 4, 6}             // Diagonals	
		};
	
	// Your checkWin method - perfect!
	

		for (int[] pattern : winPatterns) {
			String a = board[pattern[0]];
			String b = board[pattern[1]];
			String c = board[pattern[2]];

			if (a.equals(player) && b.equals(player) && c.equals(player)) {
				return true;
			}
		}
		return false;
	}

	// Added: Get player move with validation
	public static int getPlayerMove() {
		while (true) {
			System.out.print("Player " + currentPlayer + ", enter your move (1-9): ");
			try {
				int move = scanner.nextInt();
				
				// Check if move is 1-9
				if (move < 1 || move > 9) {
					System.out.println("Invalid! Enter a number between 1-9.");
					continue;
				}
				
				// Check if spot is available
				if (!gameBoard[move - 1].equals(String.valueOf(move))) {
					System.out.println("That spot is taken! Choose another.");
					continue;
				}
				
				return move;
			} catch (Exception e) {
				System.out.println("Invalid input! Enter a number.");
				scanner.nextLine(); // Clear bad input
			}
		}
	}

	// Added: Make a move
	public static void makeMove(int position) {
		gameBoard[position - 1] = currentPlayer;
	}

	// Added: Switch players
	public static void switchPlayer() {
		currentPlayer = currentPlayer.equals("X") ? "O" : "X";
	}

	// Added: Check if board is full (for draw)
	public static boolean isBoardFull() {
		for (String cell : gameBoard) {
			if (cell.matches("[1-9]")) {  // If still has numbers
				return false;
			}
		}
		return true;
	}

	// Your main method - now made into complete game!
	public static void main(String[] args) {
		System.out.println("🎮 Welcome to Tic Tac Toe!");
		System.out.println("Player X goes first. Choose positions 1-9:");

		// Initialize the game using YOUR method
		initialize(gameBoard);

		// Game loop
		while (true) {
			// Display board using YOUR method
			displayBoard(gameBoard);

			// Get player move
			int move = getPlayerMove();

			// Make the move
			makeMove(move);

			// Check for win using YOUR method
			if (checkWin(gameBoard, currentPlayer)) {
				displayBoard(gameBoard);
				System.out.println("\n🎉 Player " + currentPlayer + " wins! 🎉");
				break;
			}

			// Check for draw
			if (isBoardFull()) {
				displayBoard(gameBoard);
				System.out.println("\n🤝 It's a draw! 🤝");
				break;
			}

			// Switch to other player
			switchPlayer();
		}

		System.out.println("Thanks for playing!");
		scanner.close();
	
			//							ii. Wins can occur in 8 ways (see above).
			//								For example: A horizontal win would be found by 
			//								looking at the contents of: 
			//									gameBoard[0] & gameBoard[1] & gameBoard[2] 
			//									gameBoard[3] & gameBoard[4] & gameBoard[5] 
			//									gameBoard[6] & gameBoard[7] & gameBoard[8] 
			//
			//					b. Another option for the gameBoard would be a 2d array -- This option might be
			//						is a bit more challenging!  
			//
			//						For example:  String[][] gameBoard = new String[3][3];
			//					
			//							i. Just remember that arrays are 0 based, so to access the grid, 
			//							the index would go from 0-2 in two directions.  
			//
			//							ii. Wins can occur in 8 ways.  A horizontal win would be comparing:  
			//									gameBoard[0][0] & gameBoard[0][1] & gameBoard[0][2] 
			// 
			//		3.  Implement the rules as listed above.  
			//
			//		4.  You might want to have the following methods:
			//					a. display() -- to print the gameBoard
			//					b. checkWinStatus() -- to check if a player has won
			//					c. initialize() -- to set up your new gameBoard
			//			
			//		5.  Reminder:  There is no one way to implement this game.
			//		
			//	
			
			// START YOUR IMPLEMENTATION BELOW THIS LINE

			

		
		
}
		
		
		
		
	}


