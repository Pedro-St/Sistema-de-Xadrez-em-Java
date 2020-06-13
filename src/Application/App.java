package Application;

import java.util.Scanner;

import BoardGame.Board;
import BoardGame.position;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPiece());

		while (true) {
			try {
			UI.clearScreen();
			UI.printBoard(chessMatch.getPiece());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);

			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}
			catch (ChessException e) { 
				System.out.println(e.getMessage());
				sc.hasNextLine();
				
			}
			
			
		}
			
	}

}
