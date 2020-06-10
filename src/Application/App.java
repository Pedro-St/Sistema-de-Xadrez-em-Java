package Application;

import BoardGame.Board;
import BoardGame.position;
import chess.ChessMatch;

public class App {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPiece());
		
	}

}
